package com.register.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Emp_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name", nullable = false, length = 15)
    private String name;
    @Column(name = "emp_phone")
    private String phone;
    @Column(name = "emp_email", nullable = false)
    private String email;
    @Column(name = "emp_dept", nullable = false)
    private String department;
    @Column(name = "emp_pass", nullable = false)
    private String password;

    public Employee(int id, String name, String phone, String email, String department, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.password = password;
    }

    public Employee() {
    }
}
