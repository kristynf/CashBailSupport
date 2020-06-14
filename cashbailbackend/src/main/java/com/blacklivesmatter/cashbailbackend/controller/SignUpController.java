package com.blacklivesmatter.cashbailbackend.controller;

import com.blacklivesmatter.cashbailbackend.model.AppUser;
import com.blacklivesmatter.cashbailbackend.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class SignUpController {


private final AuthService authService;



    @GetMapping("/signup")
    public String showSignUp(){
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(AppUser fromForm){
        AppUser createdUser = authService.signUp(fromForm);

        return "user with id " + createdUser.getId() + " created";
    }

}
