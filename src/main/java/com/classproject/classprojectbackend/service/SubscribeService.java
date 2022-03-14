package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.QuestionRepository;
import com.classproject.classprojectbackend.Repositories.SubscribeRepository;
import com.classproject.classprojectbackend.entity.Question;
import com.classproject.classprojectbackend.entity.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {
    @Autowired(required=true)
    public SubscribeRepository subscribeRepository;

    public Subscribe saveSubscribe(Subscribe subscribe){

        return  subscribeRepository.save(subscribe);
    }
}
