package com.example.demo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/create")
    public User create(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("username") String username,
            @RequestParam("age") Integer age,
            @RequestParam("isResident") Boolean isResident
    ) {
        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .username(username)
                .age(age)
                .isResident(isResident)
                .build();
        return userRepository.save(user);
    }

    @GetMapping("/get/{userId}")
    public UserPresentation getUserPresentation(@PathVariable("userId") Integer userId) {
        return userRepository.getPresentation(userId);
    }
}
