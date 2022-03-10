package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "persistent_logins")
public class PersistentLogin {
    @Column(nullable=false,length=64)
    private String username;

    @Id
    @Column(nullable=false,length=64)
    private String series;

    @Column(nullable=false,length=64)
    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_used",nullable=false)
    private Date date;
}