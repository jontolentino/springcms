package com.springcms.springcms.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

//    @PostMapping("/auth/login")
//    public String processLogin(@RequestBody LoginDto loginDto){
//
//        System.out.println("JONJON " + loginDto.toString());
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword())
//        );
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return "redirect:/home";
//
//    }
}
