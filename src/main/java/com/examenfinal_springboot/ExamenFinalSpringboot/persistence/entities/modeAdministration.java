package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modeadministration")
public class modeAdministration {
    @Id
    private int id;

    @Column(name = "descriptionmode")
    private String descriptionmode;

    public modeAdministration(int id, String descriptionmode) {
        this.id = id;
        this.descriptionmode = descriptionmode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptionmode() {
        return descriptionmode;
    }

    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }
    
}
