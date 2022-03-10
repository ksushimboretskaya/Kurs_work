package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "records")
@Entity
public class Records implements Serializable {
    private static final long serialVersionUID = 9L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long recordsId;

    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name="employeeId")
    private Employee employee;

    @OneToOne
    @JoinColumn(name="servicesId")
    private Services services;
}