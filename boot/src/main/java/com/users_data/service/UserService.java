package com.users_data.service;

import com.users_data.domain.UserClass;
import com.users_data.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



    private final UserRepository userRepository;
    UserClass user = new UserClass();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserClass> list(){
        return userRepository.findAll();
    }

    public UserClass save(UserClass user_Class_data){
        return userRepository.save(user_Class_data);
    }

    public void save(List<UserClass> users_data) {
        userRepository.saveAll(users_data);
    }
}
