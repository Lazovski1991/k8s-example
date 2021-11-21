package my.company.servicefriends.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String getText() {
        return "Hello friends";
    }
}
