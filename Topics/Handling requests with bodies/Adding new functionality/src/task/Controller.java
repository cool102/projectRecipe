package task;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@RestController
public class Controller {

    public static int unique = 0;
    Map<Integer, String> map = new ConcurrentHashMap<>();

    @GetMapping("/api/data/{id}")
    public Map<String, String> getData(@PathVariable int id) {
        return Map.of("data", map.get(id));
    }

    // add your code below this line
    @PostMapping("/api/data/new")
    public String postData(@RequestBody Data data) {
        unique++;
        map.put(unique, data.getData());
        return "{" +
                "\"id\"" + ":" + unique +
                "}";
    }
}
