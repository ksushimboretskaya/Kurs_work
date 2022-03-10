package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Getter
@Setter
@RequiredArgsConstructor
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeService;

    @OneToOne
    @JoinColumn(name = "servicesId")
    protected Services services;
}