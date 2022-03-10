package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "authorities")
@Entity
public class Authorities {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long authoritiesId;
    private String username;
    private String authorityType;
}