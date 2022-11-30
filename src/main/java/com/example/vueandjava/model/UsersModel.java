package com.example.vueandjava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class UsersModel {
    @Id
    private String userId;

    private String password;

    private String userName;

    private Date birthday;

    private Integer age;

    private Integer gender;

    private Integer departmentId;

    private String role;
}