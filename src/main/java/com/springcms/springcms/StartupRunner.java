package com.springcms.springcms;


import com.springcms.springcms.login.User;
import com.springcms.springcms.login.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//import java.util.logging.Logger;

@Component
public class StartupRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    public UserService userService;

    @Override
    public void run(String...args) throws Exception {
        LOG.info("===STARTUP RUNNER===");
        User startupUser = new User();
        startupUser.setEmail("jon@gmail.com");
        startupUser.setPassword("12312");
        List<String> userRoles = new ArrayList<>();
        userRoles.add("ROLE_USER");
        userRoles.add("ROLE_ADMIN");
        startupUser.setRoles(userRoles);
        userService.save(startupUser);

    }



}
