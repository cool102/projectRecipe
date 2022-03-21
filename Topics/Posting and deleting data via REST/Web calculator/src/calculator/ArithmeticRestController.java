package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {
    @GetMapping("/{operation}")
    public String calculate(@PathVariable String operation, @RequestParam int a, @RequestParam int b) {
        if (operation.equals("add")) {
            return String.valueOf(a + b);
        }
        if (operation.equals("subtract")) {
            return String.valueOf(a - b);

        }
        if (operation.equals("mult")) {
            return String.valueOf(a * b);
        }

        return "Unknown operation";
    }
}