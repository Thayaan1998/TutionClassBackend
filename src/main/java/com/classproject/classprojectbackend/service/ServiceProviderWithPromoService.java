package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.PostRequirementRepository;
import com.classproject.classprojectbackend.Repositories.ServiceProviderWithPromoRepository;
import com.classproject.classprojectbackend.entity.PostRequirement;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import com.classproject.classprojectbackend.entity.ServiceProviderWithPromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProviderWithPromoService {

    @Autowired(required = true)
    public ServiceProviderWithPromoRepository serviceProviderWithPromorepository;



    public ServiceProviderWithPromo saveServiceProvider(ServiceProviderWithPromo serviceProviderWithPromo) {

        return serviceProviderWithPromorepository.save(serviceProviderWithPromo);
    }


}
