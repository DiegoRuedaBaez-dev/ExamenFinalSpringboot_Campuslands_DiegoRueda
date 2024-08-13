package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class customer {
    @Id
    private int idcustomer;

    @Column(name = "namecustomer")
    private String namecustomer;
    
    @Column(name = "lastnamecustomer")
    private String lastnamecustomer;

    @Column(name = "codecitycustomer")
    private String codecitycustomer;

    @Column(name = "emailcustomer")
    private String emailcustomer;

    @Column(name = "birthdate")
    private LocalDate birthdate;
    
    @Column(name = "ion")
    private double ion;

    @Column(name = "iatitud")
    private double iatitud;

    public customer(int idcustomer, String namecustomer, String lastnamecustomer, String codecitycustomer,
            String emailcustomer, LocalDate birthdate, double ion, double iatitud) {
        this.idcustomer = idcustomer;
        this.namecustomer = namecustomer;
        this.lastnamecustomer = lastnamecustomer;
        this.codecitycustomer = codecitycustomer;
        this.emailcustomer = emailcustomer;
        this.birthdate = birthdate;
        this.ion = ion;
        this.iatitud = iatitud;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public String getCodecitycustomer() {
        return codecitycustomer;
    }

    public void setCodecitycustomer(String codecitycustomer) {
        this.codecitycustomer = codecitycustomer;
    }

    public String getEmailcustomer() {
        return emailcustomer;
    }

    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getIon() {
        return ion;
    }

    public void setIon(double ion) {
        this.ion = ion;
    }

    public double getIatitud() {
        return iatitud;
    }

    public void setIatitud(double iatitud) {
        this.iatitud = iatitud;
    }
   
}
