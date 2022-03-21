package task;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
@GetMapping("/{T}")
    public <T> T returnBack(@PathVariable("T") T t){
    return t;

}
}
