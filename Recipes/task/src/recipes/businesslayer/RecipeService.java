package recipes.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import recipes.persistence.RecipeRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;


    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findByCategory(String category) {
        return recipeRepository.findByCategoryIgnoreCaseOrderByDateDesc(category);
    }
    public List<Recipe> findByName(String name) {
        return recipeRepository.findByNameContainingIgnoreCaseOrderByDateDesc(name);
    }

    public void updateRecipe(Long id, Recipe recipe) {
        Recipe findedRecipe;
        Optional<Recipe> optFindedRecipe = recipeRepository.findById(id);
        if (optFindedRecipe.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            findedRecipe = optFindedRecipe.get();
        }
        findedRecipe.setCategory(recipe.getCategory());
        findedRecipe.setDate(LocalDateTime.now());
        findedRecipe.setDescription(recipe.getDescription());
        findedRecipe.setDirections(recipe.getDirections());
        findedRecipe.setName(recipe.getName());
        findedRecipe.setIngredients(recipe.getIngredients());
        recipeRepository.save(findedRecipe);

    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);

    }

    public Recipe findRecipeById(Long id) {
        if (!recipeRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            Optional<Recipe> optRes = recipeRepository.findById(id);
            return optRes.orElse(null);

        }


    }

    public ResponseEntity<HttpStatus> deleteRecipeById(Long id) {
        if (!recipeRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            recipeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }


    }
}
