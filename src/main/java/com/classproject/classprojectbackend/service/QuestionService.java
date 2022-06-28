package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.InqueringAboutRepository;
import com.classproject.classprojectbackend.Repositories.QuestionRepository;
import com.classproject.classprojectbackend.Repositories.QuestionRepository2;
import com.classproject.classprojectbackend.entity.InqueringAbout;
import com.classproject.classprojectbackend.entity.Question;
import com.classproject.classprojectbackend.entity.Question2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {

    @Autowired(required=true)
    public QuestionRepository questionRepository;


    @Autowired(required=true)
    public QuestionRepository2 questionRepository2;

    @Autowired(required=true)
    public InqueringAboutRepository inqueringAbout;

    public Question saveQuestion(Question question){

        return  questionRepository.save(question);
    }

    public Question2 saveQuestion2(Question2 question2){

        return  questionRepository2.save(question2);
    }

    public ArrayList<InqueringAbout> getInquringAbout(){

        return  (ArrayList<InqueringAbout>)inqueringAbout.findAll();
    }

    public ArrayList<Question> getQuestions(int serviceProviderId){

        return  (ArrayList<Question>)questionRepository.getQuestions(serviceProviderId);
    }

    public ArrayList<Question2> getQuestions2(){

        return  (ArrayList<Question2>)questionRepository2.findAll();
    }


}
