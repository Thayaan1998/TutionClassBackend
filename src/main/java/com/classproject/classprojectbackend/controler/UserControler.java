package com.classproject.classprojectbackend.controler;

import com.classproject.classprojectbackend.entity.Customer;
import com.classproject.classprojectbackend.entity.UserType;
import com.classproject.classprojectbackend.entity.Users;
import com.classproject.classprojectbackend.service.CustomerService;
import com.classproject.classprojectbackend.service.UserService;
import com.classproject.classprojectbackend.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserControler {

    @Autowired(required=true)
    private UserService userService;

    @Autowired(required=true)
    private UserTypeService userTypeService;

    @PostMapping("/postUsers")
    public ResponseEntity<String> addUser(@RequestBody Users users){
        Users users1;
        try{
            users1=userService.getUserByEmail(users.getEmail());

            if(users1==null){
                users1=userService.saveUser(users);
                return new ResponseEntity<String>("user Details Added Successfully", HttpStatus.OK);
            }else{
                return new ResponseEntity<String>("user email already there", HttpStatus.OK);
            }

        }catch (Exception ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/getUserTypes")
    public ResponseEntity<ArrayList<UserType>> getUserTypes(){
        ArrayList<UserType> usersTypes=null;
        try{
            usersTypes=userTypeService.getUserType();

            return new ResponseEntity<ArrayList<UserType>>(usersTypes, HttpStatus.OK);



        }catch (Exception ex){
            return null;
        }

    }

    @GetMapping("/getUserTypes1")
    public String getUserTypes1(){
        ArrayList<UserType> usersTypes=null;
        try{
            usersTypes=userTypeService.getUserType();

            return usersTypes.toString();
        }catch (Exception ex){
            return ex.getMessage();
        }

    }
}
