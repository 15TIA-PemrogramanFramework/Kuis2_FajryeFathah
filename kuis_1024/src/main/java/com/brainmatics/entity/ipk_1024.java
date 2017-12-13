/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "tbl_ipk_1024")
public class ipk_1024 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
    @Column(length = 255, nullable = true)
    private String dosen;
    @Column(length = 255, nullable = true)
    private String matkul;
    @ManyToOne
    private identitas_1024 identitas_1024;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dosen
     */
    public String getDosen() {
        return dosen;
    }

    /**
     * @param dosen the dosen to set
     */
    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    /**
     * @return the matkul
     */
    public String getMatkul() {
        return matkul;
    }

    /**
     * @param matkul the matkul to set
     */
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    /**
     * @return the identitas_1024
     */
    public identitas_1024 getIdentitas_1024() {
        return identitas_1024;
    }

    /**
     * @param identitas_1024 the identitas_1024 to set
     */
    public void setIdentitas_1024(identitas_1024 identitas_1024) {
        this.identitas_1024 = identitas_1024;
    }

    /**
     * @return the id
     */
    
    
    
}
