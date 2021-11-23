package my.company.servicefriends.controller;

import my.company.servicefriends.FriendService;
import my.company.servicefriends.model.Friend;
import my.company.servicefriends.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class TestController {
    @Autowired
    private FriendService friendService;

    @GetMapping
    public String getText() {
        return "Hello friends";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String userName) {
        return friendService.save(userName);
    }

    @GetMapping("/friends")
    public List<Friend> getUsers() {
        return friendService.findAll();
    }
}
