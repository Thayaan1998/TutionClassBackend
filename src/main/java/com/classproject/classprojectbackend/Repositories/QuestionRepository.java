package com.classproject.classprojectbackend.Repositories;

import com.classproject.classprojectbackend.entity.PostRequirement;
import com.classproject.classprojectbackend.entity.Question;
import com.classproject.classprojectbackend.entity.Quotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface QuestionRepository extends CrudRepository<Question,Integer> {

    @Query(value = "SELECT * FROM askquestion where serviceProviderId = ?1", nativeQuery = true)
    public ArrayList<Question> getQuestions(int serviceProviderId);
}
