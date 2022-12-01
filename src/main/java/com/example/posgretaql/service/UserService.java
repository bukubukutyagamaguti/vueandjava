package com.example.posgretaql.service;

import com.example.posgretaql.model.UserModel;
import com.example.posgretaql.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private UserRepository repository;
    public UserService(
            UserRepository repository
    ) {
        this.repository = repository;
    }

    public List<UserModel> findAll() {
        return repository.findAll();
    }
}
