package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "services")
@Getter
@Setter
@RequiredArgsConstructor
public class Services implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String servicesId;
    private String servicesName;
    private String servicesCost;
    private String servicesCategory;
}