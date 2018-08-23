package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String main(){
        return "index";
    }
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<User> userList = userRepository.findAll();
        modelMap.addAttribute("users",userList);
        return "home";
    }
}
