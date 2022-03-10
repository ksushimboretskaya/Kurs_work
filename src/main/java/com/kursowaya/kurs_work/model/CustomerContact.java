package com.kursowaya.kurs_work.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="customercontact")
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class CustomerContact {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long contactId;

    @Lob
    private String contactInfo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customer;
}