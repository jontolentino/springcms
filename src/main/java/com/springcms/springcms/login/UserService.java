package com.springcms.springcms.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUser(String email){
        Optional<User> tempUser = userRepository.findByEmail(email);

        if(tempUser.isPresent()){
            return tempUser.get();
        }
        return null;
    }
}
