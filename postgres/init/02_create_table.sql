\c crm_db;
drop table if exists crm_schema.payments;
drop table if exists crm_schema.contracts;
drop table if exists crm_schema.customers;
drop table if exists crm_schema.users;
drop table if exists crm_schema.department;

/*部署テーブル*/
create table crm_schema.department(
    department_id INT primary key,
    department_name varchar(50)
);

insert into crm_schema.department(department_id, department_name)
values (1, 'システム管理部'),
       (2, '営業部'),
       (3, '企画部');

/*ユーザテーブル*/
Create table crm_schema.users(
    user_id varchar(50) primary key,
    password varchar(100),
    user_name varchar(50),
    birthday DATE,
    age Int,
    gender INT,
    department_id INT,
    role varchar(50)
);

insert into crm_schema.users(user_id,
                   password,
                   user_name,
                   birthday,
                   age,
                   gender,
                   department_id,
                   role)
values ('system@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'システム管理者', '2000-01-01', 21, 1, 1, 'ROLE_ADMIN'),
       ('user1@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'ユーザ1', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL'),
       ('user2@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'ユーザ2', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL'),
       ('user3@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'ユーザ3', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL'),
       ('user4@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'ユーザ4', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL'),
       ('mr@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'マーク', '2000-01-01', 21, 2, 3, 'ROLE_GENERAL'),
       ('mg@com.jp', '$2a$10$Uu9rtxDTOYydQMIuZG/deeNfBlE56lCFX/yjJnPcVRSFl16p66aji', 'ジェイコブ', '2000-01-01', 21, 2, 3, 'ROLE_GENERAL');


/* 顧客テーブル */
Create table crm_schema.customers(
    customer_id varchar(50) primary key,
    customer_name varchar(50),
    birthday DATE,
    age Int,
    gender INT
);

/* 契約書テーブル */
Create table crm_schema.contracts(
    contract_id SERIAL NOT NULL primary key,
    user_id varchar(50),
    customer_id varchar(50),
    contract_date DATE,
    contract_status varchar(50)
);

/* 支払いテーブル */
Create table crm_schema.payments(
    payment_id SERIAL NOT NULL primary key,
    customer_id varchar(50),
    amount INT,
    settlement_date DATE
);