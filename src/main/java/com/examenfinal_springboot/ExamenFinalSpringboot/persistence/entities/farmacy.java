package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "farmcay")
public class farmacy {
    @Id
    private int idfarmacy;

    @Column(name = "namefarmacy")
    private String namefarmacy;

    @Column(name = "addressfarmacy")
    private String addressfarmacy;

    @Column(name = "iong")
    private double iong;

    @Column(name = "iatfarmacy")
    private double iatfarmacy;

    @Column(name = "codecityfarm")
    private String codecityfarm;

    @Column(name = "logofarmacy")
    private String logofarmacy;

    public farmacy(int idfarmacy, String namefarmacy, String addressfarmacy, double iong, double iatfarmacy,
            String codecityfarm, String logofarmacy) {
        this.idfarmacy = idfarmacy;
        this.namefarmacy = namefarmacy;
        this.addressfarmacy = addressfarmacy;
        this.iong = iong;
        this.iatfarmacy = iatfarmacy;
        this.codecityfarm = codecityfarm;
        this.logofarmacy = logofarmacy;
    }

    public int getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }

    public double getIong() {
        return iong;
    }

    public void setIong(double iong) {
        this.iong = iong;
    }

    public double getIatfarmacy() {
        return iatfarmacy;
    }

    public void setIatfarmacy(double iatfarmacy) {
        this.iatfarmacy = iatfarmacy;
    }

    public String getCodecityfarm() {
        return codecityfarm;
    }

    public void setCodecityfarm(String codecityfarm) {
        this.codecityfarm = codecityfarm;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }
 
}
