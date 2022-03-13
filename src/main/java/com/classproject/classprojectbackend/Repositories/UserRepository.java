package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<Users,Integer> {

    @Query(value = "SELECT * FROM users where email= ?1", nativeQuery = true)
    public Users getUserByEmail(String email);

}
