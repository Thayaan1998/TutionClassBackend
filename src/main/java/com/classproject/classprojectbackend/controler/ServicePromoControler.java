package com.classproject.classprojectbackend.controler;

import com.classproject.classprojectbackend.entity.ServiceProvider;
import com.classproject.classprojectbackend.entity.ServiceProviderWithPromo;
import com.classproject.classprojectbackend.entity.UserType;
import com.classproject.classprojectbackend.entity.Users;
import com.classproject.classprojectbackend.service.ServiceProviderService;
import com.classproject.classprojectbackend.service.ServiceProviderWithPromoService;
import com.classproject.classprojectbackend.service.UserService;
import com.classproject.classprojectbackend.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/servicePromo")
public class ServicePromoControler {
    @Autowired(required = true)
    private ServiceProviderService serviceProviderService1;

    @Autowired(required = true)
    private ServiceProviderWithPromoService serviceProviderWithPromoService;

    @Autowired(required = true)
    private UserService userService;
    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/postPromos")
    public ResponseEntity<String> addUser(@RequestBody ServiceProviderWithPromo serviceProviderWithPromo) {
        try {

            ServiceProvider serviceProvider = serviceProviderService1.getServiceProviderByUserId(serviceProviderWithPromo.getServiceproviderId());


            Users users=userService.getUserById(serviceProvider.getUserId());

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("springtest981420@gmail.com");
            message.setTo(users.getEmail());
            message.setSubject("Promo Code");
            message.setText("12345");
            emailSender.send(message);



            ServiceProviderWithPromo serviceProviderWithPromo1 = serviceProviderWithPromoService.saveServiceProvider(serviceProviderWithPromo);
            return new ResponseEntity<String>("promo send sucessfully", HttpStatus.OK);


        } catch (Exception ex) {
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/getServiceProviders")
    public ResponseEntity<ArrayList<ServiceProvider>> getUserTypes() {
        ArrayList<ServiceProvider> serviceProvider = null;
        try {
            serviceProvider = serviceProviderService1.getServiceProvider();

            return new ResponseEntity<ArrayList<ServiceProvider>>(serviceProvider, HttpStatus.OK);


        } catch (Exception ex) {
            return null;
        }

    }

    @GetMapping("/getServiceProviders1")
    public String getUserTypes1() {
        ArrayList<ServiceProvider> serviceProvider = null;
        try {
            serviceProvider = serviceProviderService1.getServiceProvider();

            return "thayaan";


        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}


