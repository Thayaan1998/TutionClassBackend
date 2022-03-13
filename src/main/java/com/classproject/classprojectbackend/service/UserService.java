package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.UserRepository;
import com.classproject.classprojectbackend.Repositories.UserTypeRepository;
import com.classproject.classprojectbackend.entity.Customer;
import com.classproject.classprojectbackend.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required=true)
    public UserRepository userRepository;

    public Users saveUser(Users user){

        return  userRepository.save(user);
    }

    public Users getUserByEmail(String email){
        return userRepository.getUserByEmail(email);
    };
}
