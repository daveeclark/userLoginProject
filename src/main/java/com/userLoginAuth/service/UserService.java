package com.userLoginAuth.service;


import com.userLoginAuth.model.User;
import com.userLoginAuth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//Service clarifies that the class is a service
//Autowired is an annotation injection is enabled, autowiring can be used on properties, setters, and constructors.
@Service
public class UserService {


    private UserRepository userRepository;



    public Optional<User> getUserbyId(Long userId){
      return userRepository.findById( userId );
    }


    public User createUser(User user){
      return userRepository.save( user );
    }


     public void verifyUserId(Long userId, String message) {
      Optional<User> user = userRepository.findById( userId );
     }


     public void deleteUser(Long userId){
        userRepository.deleteById( userId );
     }


     public User updateUser(User user, Long userId){
        verifyUserId( userId,"User account is updated cuz" );

        user.setUserId( userId );

        return userRepository.save( user );
     }

     public Iterable<User> getAllUsers(){
        return userRepository.findAll();
     }




}
