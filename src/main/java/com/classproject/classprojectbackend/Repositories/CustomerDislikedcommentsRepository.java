package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.CustomerDislikedComments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerDislikedcommentsRepository extends CrudRepository<CustomerDislikedComments, Integer> {
    @Query(value = "SELECT * from customerdislikedcomments where serviceConsumerId =?1", nativeQuery = true)
    public ArrayList<CustomerDislikedComments> getDisLikedCommentsBy(int serviceConsumerId);
}
