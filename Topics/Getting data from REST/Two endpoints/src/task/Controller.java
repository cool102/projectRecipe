package task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Controller {

    private final List<Student> students = List.of(new Student(84, "Alice"),
            new Student(99, "Kate"), new Student(55, "Someone") );

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudent() {
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public Student getStudents(@PathVariable int id) {
        Student qwe = null;
        for (Student student : students) {
            if (student.getId() == id) {
                qwe = student;
                break;
            }
        }
        return qwe;
    }
}


