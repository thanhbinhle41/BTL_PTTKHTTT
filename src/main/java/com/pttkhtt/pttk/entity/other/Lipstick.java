package com.pttkhtt.pttk.entity.other;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Lipstick")

public class Lipstick extends Item{
    @Column
    private int type;
    @Column
    private int color;
}
