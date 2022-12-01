package com.example.posgretaql.service;

import com.example.posgretaql.model.MUserModel;
import com.example.posgretaql.model.UserModel;
import com.example.posgretaql.repository.MUserRepository;
import com.example.posgretaql.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MUserService {
    private MUserRepository repository;
    public MUserService(
            MUserRepository repository
    ) {
        this.repository = repository;
    }

    public List<MUserModel> findAll() {
        return repository.findAll();
    }
    public MUserModel getByUser(String userId) {
        return repository.findByUserId(userId);
    }
}
