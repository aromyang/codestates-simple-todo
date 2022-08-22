package codestates.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "To-do Application !";
    }

    @GetMapping("/{nickName}")
    public String welcome(@PathVariable String nickName) {
        return "hello " + nickName;
    }

}
