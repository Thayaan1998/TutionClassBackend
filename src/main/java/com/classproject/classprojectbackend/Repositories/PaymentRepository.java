package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Agent;
import com.classproject.classprojectbackend.entity.Payment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

    @Query(value = "SELECT * FROM payment where agentId = ?1 ", nativeQuery = true)
    public ArrayList<Payment> getPaymentBy(int agentId);
}
