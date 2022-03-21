package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {
    List<String> users = new ArrayList<String>();
    List<String> synUsers= Collections
            .synchronizedList(users);

    @GetMapping("/users")
    public List<String> get(){
        return synUsers;
    }

    @PostMapping("/users")
    public void add(@RequestParam String name){

        synUsers.add(name);

    }

}
