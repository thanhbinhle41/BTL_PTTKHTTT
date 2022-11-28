package com.pttkhtt.pttk.entity.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private float totalValue;
    @Column
    private Date ordered;
    @Column
    private Date shipped;
    @Enumerated(EnumType.STRING)
    @Column
    private OrderStatus orderStatus;
    @Column
    private int total;
    @OneToOne
    private Payment payment;
}
