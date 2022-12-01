package com.example.posgretaql.repository;

import com.example.posgretaql.model.MUserModel;
import com.example.posgretaql.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MUserRepository extends JpaRepository<MUserModel, Integer> {
    MUserModel findByUserId(String userId);
}
