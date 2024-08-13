package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activePrinciple")
public class activePrinciple {
    @Id
    private int idap;

    @Column(name = "nameap")
    private Serial nameap;

    public activePrinciple(int idap, Serial nameap) {
        this.idap = idap;
        this.nameap = nameap;
    }

    public int getIdap() {
        return idap;
    }

    public void setIdap(int idap) {
        this.idap = idap;
    }

    public Serial getNameap() {
        return nameap;
    }

    public void setNameap(Serial nameap) {
        this.nameap = nameap;
    }
    
}
