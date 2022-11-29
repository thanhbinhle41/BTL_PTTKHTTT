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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkFb() {
        return linkFb;
    }

    public void setLinkFb(String linkFb) {
        this.linkFb = linkFb;
    }

    public String getLinkTweeter() {
        return linkTweeter;
    }

    public void setLinkTweeter(String linkTweeter) {
        this.linkTweeter = linkTweeter;
    }

    public String getLinkPintrest() {
        return linkPintrest;
    }

    public void setLinkPintrest(String linkPintrest) {
        this.linkPintrest = linkPintrest;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
