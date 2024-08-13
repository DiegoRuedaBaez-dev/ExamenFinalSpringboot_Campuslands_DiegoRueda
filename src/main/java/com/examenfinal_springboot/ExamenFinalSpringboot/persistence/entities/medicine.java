package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class medicine {
    @Id
    private int id;

    @Column(name="proceedings")
    private String proceedings;

    @Column(name="namemedicine")
    private String namemedicine;

    @Column(name="healthregister")
    private int healthregister;

    @Column(name="description")
    private int description;

    @Column(name="descriptionshort")
    private int descriptionshort;

    @Column(name="codemodeadmin")
    private int codemodeadmin;

    @Column(name="codeap")
    private int codeap;

    @Column(name="codeum")
    private int codeum;

    @Column(name="namerol")
    private int namerol;

    @Column(name="codelab")
    private int codelab;

    public medicine(int id, String proceedings, String namemedicine, int healthregister, int description,
            int descriptionshort, int codemodeadmin, int codeap, int codeum, int namerol, int codelab) {
        this.id = id;
        this.proceedings = proceedings;
        this.namemedicine = namemedicine;
        this.healthregister = healthregister;
        this.description = description;
        this.descriptionshort = descriptionshort;
        this.codemodeadmin = codemodeadmin;
        this.codeap = codeap;
        this.codeum = codeum;
        this.namerol = namerol;
        this.codelab = codelab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getNamemedicine() {
        return namemedicine;
    }

    public void setNamemedicine(String namemedicine) {
        this.namemedicine = namemedicine;
    }

    public int getHealthregister() {
        return healthregister;
    }

    public void setHealthregister(int healthregister) {
        this.healthregister = healthregister;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getDescriptionshort() {
        return descriptionshort;
    }

    public void setDescriptionshort(int descriptionshort) {
        this.descriptionshort = descriptionshort;
    }

    public int getCodemodeadmin() {
        return codemodeadmin;
    }

    public void setCodemodeadmin(int codemodeadmin) {
        this.codemodeadmin = codemodeadmin;
    }

    public int getCodeap() {
        return codeap;
    }

    public void setCodeap(int codeap) {
        this.codeap = codeap;
    }

    public int getCodeum() {
        return codeum;
    }

    public void setCodeum(int codeum) {
        this.codeum = codeum;
    }

    public int getNamerol() {
        return namerol;
    }

    public void setNamerol(int namerol) {
        this.namerol = namerol;
    }

    public int getCodelab() {
        return codelab;
    }

    public void setCodelab(int codelab) {
        this.codelab = codelab;
    }

    
}
