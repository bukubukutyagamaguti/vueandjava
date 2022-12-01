package com.example.posgretaql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "m_user", schema = "crm_schema")
public class MUserModel {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "password")
    private String password;
    @Column(name = "pass_update_date")
    private Timestamp passUpdateDate;
    @Column(name = "login_miss_times")
    private Integer loginMissTimes;
    @Column(name = "unlock")
    private Boolean unlock;
    @Column(name = "tenant_id")
    private String tenantId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "mail_address")
    private String mailAddress;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "user_due_date")
    private Timestamp userDueDate;
}