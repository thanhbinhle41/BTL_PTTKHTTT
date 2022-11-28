package com.pttkhtt.pttk.entity.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String linkFb;
    @Column
    private String linkTweeter;
    @Column
    private String linkPintrest;
    @Column
    private Date dob;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String address;
    @Column
    private String typeCustomer;
}
