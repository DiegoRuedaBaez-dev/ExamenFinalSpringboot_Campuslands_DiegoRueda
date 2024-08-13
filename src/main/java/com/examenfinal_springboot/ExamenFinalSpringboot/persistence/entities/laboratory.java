package com.examenfinal_springboot.ExamenFinalSpringboot.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "laboratory")
public class laboratory {
    @Id
    private int id;

    @Column(name = "namelab")
    private String namelab;

    @Column (name = "codecityreg")
    private String codecityreg;

    public laboratory(int id, String namelab, String codecityreg) {
        this.id = id;
        this.namelab = namelab;
        this.codecityreg = codecityreg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public String getCodecityreg() {
        return codecityreg;
    }

    public void setCodecityreg(String codecityreg) {
        this.codecityreg = codecityreg;
    }

    
}
