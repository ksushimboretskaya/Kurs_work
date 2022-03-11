package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@RequiredArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 2681531852204068105L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    private String username;
    private String password;
    private boolean enabled;
    private long customerId;
}