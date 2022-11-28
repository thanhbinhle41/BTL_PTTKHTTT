package com.pttkhtt.pttk.entity.other;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "Shampo")

public class Shampo extends Item{
    @Column
    private int type;
}
