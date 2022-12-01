package com.example.posgretaql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="users", schema = "crm_schema")
public class UserModel {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "role")
    private String role;
}
