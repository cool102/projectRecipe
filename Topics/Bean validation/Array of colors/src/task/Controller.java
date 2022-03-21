package task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import javax.validation.constraints.*;


@RestController
public class Controller {

    @PostMapping("/api/colors")
    void postColors(@Valid @RequestBody Temp temp) {

    }
}

@Getter
@NoArgsConstructor
class Temp {
    @NotNull
    @Size(min = 3, max = 12)
    String[] colors;
}