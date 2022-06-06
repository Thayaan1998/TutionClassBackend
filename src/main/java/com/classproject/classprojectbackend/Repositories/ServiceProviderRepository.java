package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Question;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import com.classproject.classprojectbackend.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ServiceProviderRepository extends CrudRepository<ServiceProvider,Integer> {

    @Query(value = "SELECT * FROM serviceprovider where serviceProviderId = ?1 ", nativeQuery = true)
    public ServiceProvider getServiceProviderByUserId(int serviceProviderId);
}
