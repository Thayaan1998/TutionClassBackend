package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Question;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import org.springframework.data.repository.CrudRepository;

public interface ServiceProviderRepository extends CrudRepository<ServiceProvider,Integer> {
}
