package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class city {
    @Column(name = "codecity")
    private String codecity;

    @Column(name = "namecity")
    private String namecity;
    
    @Column(name = "codereg")
    private int codereg;

    public city(String codecity, String namecity, int codereg) {
        this.codecity = codecity;
        this.namecity = namecity;
        this.codereg = codereg;
    }

    public String getCodecity() {
        return codecity;
    }

    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public int getCodereg() {
        return codereg;
    }

    public void setCodereg(int codereg) {
        this.codereg = codereg;
    }
 
}
