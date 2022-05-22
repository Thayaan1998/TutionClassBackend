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
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserControler {

    @Autowired(required=true)
    private UserService userService;

    @Autowired(required=true)
    private UserTypeService userTypeService;

    @Autowired
    private JavaMailSender emailSender;

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

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users users){
        Users users1;
        try{
            users1=userService.getUserByEmailAndPassword(users.getEmail(),users.getPassword());

            if(users1==null){
                return new ResponseEntity<String>("Not valid username or password", HttpStatus.OK);
            }else{
                Random rnd = new Random();
                int number = rnd.nextInt(9999);
                SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom("springtest981420@gmail.com");
                message.setTo("selvathayaan3@gmail.com");
                message.setSubject("OTP Number");
                message.setText(String.format("%04d", number));
                emailSender.send(message);

                return new ResponseEntity<String>(String.format("%04d", number), HttpStatus.OK);
            }

        }catch (Exception ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }


    @GetMapping("/sendEmail")
    public ResponseEntity<String> sendEmail() throws IOException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("springtest981420@gmail.com");
        message.setTo("selvathayaan3@gmail.com");
        message.setSubject("aaaaa");
        message.setText("hi thayaan");
        emailSender.send(message);

        return new ResponseEntity<String>("Thayaan", HttpStatus.OK);
    }
}
