package com.pttkhtt.pttk.entity.other;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Perfumer")

public class Perfumer extends Item{
    @Column
    private int type;
    @Column
    private String scent;
}
