package task;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class Controller {
    final Map<Long, String> users = new ConcurrentHashMap<>(Map.of(
            2234L, "Kate",
            234234234L, "Alice",
            2134L, "Jessica",
            3456L, "Olivia",
            98684L, "Emma",
            85L, "Liam",
            8495L, "James",
            48438L, "Henry"
    ));

    @DeleteMapping("/users/{id}")
    public void delUser(@PathVariable long id) {
        if (users.containsKey(id)) {
            users.remove(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);

        } else {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
