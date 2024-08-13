package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class region {
    @Id
    private int codereg;

    @Column(name = "namelab")
    private String namelab;
    
    @Column(name = "codecountry")
    private String codecountry;

    public region(int codereg, String namelab, String codecountry) {
        this.codereg = codereg;
        this.namelab = namelab;
        this.codecountry = codecountry;
    }

    public int getCodereg() {
        return codereg;
    }

    public void setCodereg(int codereg) {
        this.codereg = codereg;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }
    
}
