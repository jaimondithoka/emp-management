package com.example.empmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private Double salary;
}