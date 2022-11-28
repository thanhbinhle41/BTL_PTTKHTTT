package com.pttkhtt.pttk.entity.other;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SaleCampaign")

public class SaleCampaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private float discount;
    @Column
    private String description;
    @Column
    private String name;
}
