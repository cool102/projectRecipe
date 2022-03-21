package task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Optional;
import java.util.Queue;

@RestController
public class Controller {

    Queue<Msg> queue = Collections.asLifoQueue(new ArrayDeque<Msg>());

    @PostMapping("/message")
    public void add(@RequestBody Msg msg) {
        queue.add(msg);

    }

    @GetMapping("/message")
    public Msg get() {
        Optional<Msg> msg = queue.stream().findFirst();
        return msg.get();
    }

}
