package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.ServiceConsumer;
import com.classproject.classprojectbackend.entity.ServiceProvider;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ServiceConsumerRepository  extends CrudRepository<ServiceConsumer,Integer> {

    @Query(value = "SELECT COUNT(*) FROM serviceconsumer", nativeQuery = true)
    public int getConsumerCount();
}
