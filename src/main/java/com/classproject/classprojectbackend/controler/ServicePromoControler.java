package com.classproject.classprojectbackend.controler;

import com.classproject.classprojectbackend.entity.*;
import com.classproject.classprojectbackend.service.*;
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

    @Autowired(required = true)
    private AgentService agentService;

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/postPromos")
    public ResponseEntity<String> addUser(@RequestBody ServiceProviderWithPromo serviceProviderWithPromo) {
        try {

            ServiceProvider serviceProvider = serviceProviderService1.getServiceProviderByUserId(serviceProviderWithPromo.getServiceproviderId());
            System.out.println(serviceProvider);
            Users users=userService.getUserById(serviceProvider.getUsers().getUserId());

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("springtest981420@gmail.com");
            message.setTo(users.getEmail());
            message.setSubject("Promo Code");
            message.setText("12345");
            emailSender.send(message);



            ServiceProviderWithPromo serviceProviderWithPromo1 = serviceProviderWithPromoService.saveServiceProvider(serviceProviderWithPromo);
            return new ResponseEntity<String>("promo send sucessfully", HttpStatus.OK);


        } catch (Exception ex) {
            System.out.println(ex);
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

    @GetMapping("/sendPromo/{email},{promo}")
    public String sendPromo(@PathVariable("email") String email,@PathVariable("promo")String promo) {

        try {
            String email1= serviceProviderWithPromoService.getEmail(email);

            if(email1.equals("no valid email")){
                Agent agent=agentService.getAgentByPromo(promo);
                SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom("springtest981420@gmail.com");
                message.setTo(email);
                message.setSubject("Promo Code fpr Service Hub");
                message.setText(promo+" "+"From This promo code you will get"
                        +"\n\n"+"Gold Package Discount:"+agent.getGoldDiscount()+"rs"
                        +"\n\n"+"Silver Package Discount:"+agent.getSilverDiscount()+"rs"
                        +"\n\n"+"Platinum Package Discount:"+agent.getPlatinumDiscount()+"rs"

                );
                emailSender.send(message);
                return "send successfully";
            }else{
                return "this email already there";
            }



        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}


