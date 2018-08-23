package com.example.controller;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public String add(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/home";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        userRepository.deleteById(id);
        return "redirect:/home";
    }
}
