//package com.springcms.springcms.controller;
//
//import com.springcms.springcms.model.User;
//import com.springcms.springcms.security.CustomUserDetailsService;
//import com.springcms.springcms.security.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class UserController {
////    @Autowired
////    private UserService userService;
////
////    @Autowired
////    private PasswordEncoder passwordEncoder;
////
////    @Autowired
////    private AuthenticationManager authenticationManager;
////
////    @GetMapping("/register")
////    public String showRegistrationForm(Model model) {
////        model.addAttribute("user", new User());
////        return "register";
////    }
////
////    @PostMapping("/register")
////    public String processRegister(User user) {
////        user.setPassword(passwordEncoder.encode(user.getPassword()));
////        userService.save(user);
////        return "register_success";
////    }
////
//    @GetMapping("/login")
//    public String showLoginForm() {
//        return "login";
//    }
//
////    @PostMapping("/logins")
////    public void processLogin(@RequestParam("username") String username,
////                               @RequestParam("password") String password){
////
////        System.out.println(username + password);
//////        Authentication authentication = authenticationManager.authenticate(
//////                new UsernamePasswordAuthenticationToken(username, password)
//////        );
////
//////        SecurityContextHolder.getContext().setAuthentication(authentication);
////
////
////    }
//
////    @GetMapping("/user/successlogin")
////    public String showsucLoginForm() {
////        return "successlogin";
////    }
//
////    @GetMapping("/user/join")
////    public String getUserJoin(){
////        return "user_join";
////    }
//}
//
////    User user = new User();
////user.getRoles().add(UserRole.ROLE_ADMIN.toString());
