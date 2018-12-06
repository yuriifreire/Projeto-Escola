/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.web.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author beatriz
 */
@Entity
public class Disciplina implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDis;
    private long cargHor;
    

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDis() {
        return nomeDis;
    }

    public void setNomeDis(String nomeDis) {
        this.nomeDis = nomeDis;
    }

    

    public long getCargHor() {
        return cargHor;
    }

    public void setCargHor(long cargHor) {
        this.cargHor = cargHor;
    }
    
    
    
}
