package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.ServiceProviderRepository;
import com.classproject.classprojectbackend.Repositories.ServiceProviderWithPromoRepository;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import com.classproject.classprojectbackend.entity.ServiceProviderWithPromo;
import com.classproject.classprojectbackend.entity.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServiceProviderService {
    @Autowired(required = true)
    public ServiceProviderRepository serviceProviderRepo;



    public ArrayList<ServiceProvider>  getServiceProvider() {

       return  (ArrayList< ServiceProvider> )serviceProviderRepo.findAll();
    }
}
