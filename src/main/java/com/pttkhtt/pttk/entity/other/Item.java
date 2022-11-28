package com.pttkhtt.pttk.entity.other;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Item")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private float size;
    @Column
    private String description;
    @Column
    private int amount;
    @Column
    private float price;
    @Column
    private String photo;
    @ManyToOne
    private Catalog catalog;
}
