package recipes.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import recipes.businesslayer.*;
import recipes.persistence.UserRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipesController {

    @Autowired
    RecipeService recipeService;

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/api/register")
    public ResponseEntity registerNewUser(@Valid @RequestBody User newUser) {

        List<User> findedUsers = userRepository.findByEmailIgnoreCase(newUser.getEmail());
        if (findedUsers.isEmpty()) {
            newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
            userService.saveToDb(newUser);
            return ResponseEntity.status(200).build();
        } else {
            return ResponseEntity.status(400).build();
        }
    }

    @PostMapping("/api/recipe/new")
    public ResponseEntity<IdDto> sendRecipe(@Valid @RequestBody Recipe recipe, Authentication auth) {

        UserDetails details = (UserDetails) auth.getPrincipal();
        System.out.println(details);
        System.out.println(details.getUsername());
        recipe.setEmail(details.getUsername());

        Recipe savedRecipe = recipeService.saveRecipe(recipe);

        return new ResponseEntity<IdDto>(new IdDto(savedRecipe.getId()), HttpStatus.OK);

    }

    @PutMapping("/api/recipe/{id}")
    public ResponseEntity updateRecipe(@PathVariable Long id, @Valid @RequestBody Recipe recipe, @AuthenticationPrincipal UserDetails details) {
        String loggedUser = details.getUsername();
        Recipe findedRecipe = recipeService.findRecipeById(id);
        String dbUser = findedRecipe.getEmail();
        if (dbUser.equals(loggedUser)) {
            recipeService.updateRecipe(id, recipe);
            return ResponseEntity.status(204).build();
        }
        else return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @GetMapping(value = "/api/recipe/search")
    public ResponseEntity<List<Recipe>> searchRecipe(@Nullable @RequestParam String category, @Nullable @RequestParam String name) {
        List<Recipe> recipes = new ArrayList<>();
        if (name == null && category == null) {
            return ResponseEntity.badRequest().build();
        }
        if (name == null) {
            recipes = recipeService.findByCategory(category);
        } else if (category == null) {
            recipes = recipeService.findByName(name);
        }
        return ResponseEntity.ok(recipes);
    }


    @GetMapping("/api/recipe/{id}")
    public Recipe getRecipe(@PathVariable Long id) {
        return recipeService.findRecipeById(id);
    }

    @DeleteMapping("/api/recipe/{id}")
    ResponseEntity<HttpStatus> deleteRecipe(@AuthenticationPrincipal UserDetails details, @PathVariable Long id) {
        String loggedUser = details.getUsername();
        Recipe findedRecipe = recipeService.findRecipeById(id);
        String dbUser = findedRecipe.getEmail();
        if (dbUser.equals(loggedUser)) {
            return recipeService.deleteRecipeById(id);
        } else return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }


}
