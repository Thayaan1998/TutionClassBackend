package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.QuestionRepository;
import com.classproject.classprojectbackend.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired(required=true)
    public QuestionRepository questionRepository;

    public Question saveQuestion(Question question){

        return  questionRepository.save(question);
    }
}
