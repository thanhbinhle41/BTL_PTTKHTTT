package com.pttkhtt.pttk.entity.order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Table(name = "Visa")
public class Visa extends Payment{
    @Column
    private String name;
    @Column
    private String idNumber;
}
