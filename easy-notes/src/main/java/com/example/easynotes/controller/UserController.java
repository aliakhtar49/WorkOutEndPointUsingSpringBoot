package com.example.easynotes.controller;


import com.example.easynotes.model.User;
import com.example.easynotes.repository.NoteRepository;
import com.example.easynotes.repository.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.asm.Register;

import javax.validation.Valid;
import javax.validation.constraints.Null;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    // Create a new User
    @PostMapping("/register")
    public User createUser(@Valid @RequestBody User user) {

        return userRepository.save(user);
    }

    // Create a new User
    @GetMapping("/login/{email}/{password}")
    public User login(@PathVariable String email, @PathVariable String password) {

        return userRepository.getUserByEmailAndPassword(email,password);
    }
}
