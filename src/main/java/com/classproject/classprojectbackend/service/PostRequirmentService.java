package com.classproject.classprojectbackend.service;

import com.classproject.classprojectbackend.Repositories.PostRequirementRepository;
import com.classproject.classprojectbackend.Repositories.UserRepository;
import com.classproject.classprojectbackend.entity.PostRequirement;
import com.classproject.classprojectbackend.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostRequirmentService {

    @Autowired(required = true)
    public PostRequirementRepository postRequirementRepository;

    public PostRequirement savePostRequirement(PostRequirement postRequirement) {

        return postRequirementRepository.save(postRequirement);
    }
}

