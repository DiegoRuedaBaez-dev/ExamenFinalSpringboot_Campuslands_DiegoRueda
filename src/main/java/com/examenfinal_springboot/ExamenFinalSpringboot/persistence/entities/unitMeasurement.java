package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitmeasurement")
public class unitMeasurement {
    @Id
    private Serial idum;

    @Column(name = "nameum")
    private String nameum;

    public unitMeasurement(Serial idum, String nameum) {
        this.idum = idum;
        this.nameum = nameum;
    }

    public Serial getIdum() {
        return idum;
    }

    public void setIdum(Serial idum) {
        this.idum = idum;
    }

    public String getNameum() {
        return nameum;
    }

    public void setNameum(String nameum) {
        this.nameum = nameum;
    }
 
}
