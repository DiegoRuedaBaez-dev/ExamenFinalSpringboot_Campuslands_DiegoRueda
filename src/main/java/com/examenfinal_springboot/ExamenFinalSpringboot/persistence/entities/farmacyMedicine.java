package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "farmacyMedicine")
public class farmacyMedicine {
    @Id
    private int idfarmacy;
    @Id
    private int idmedicinefatrm;

    @Column(name = "price")
    private double price;

    public farmacyMedicine(int idfarmacy, int idmedicinefatrm, double price) {
        this.idfarmacy = idfarmacy;
        this.idmedicinefatrm = idmedicinefatrm;
        this.price = price;
    }

    public int getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public int getIdmedicinefatrm() {
        return idmedicinefatrm;
    }

    public void setIdmedicinefatrm(int idmedicinefatrm) {
        this.idmedicinefatrm = idmedicinefatrm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
