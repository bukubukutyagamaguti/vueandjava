package com.example.vueandjava.repository;

import com.example.vueandjava.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository extends JpaRepository<UsersModel> {
}
