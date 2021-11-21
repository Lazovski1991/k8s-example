package my.company.servicefriends.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${databaseName}")
    private String databaseName;

    @GetMapping
    public String getText() {
        return "Hello friends " + databaseName;
    }
}
