package com.example.giovanni.giovanni.bean;

import java.io.Serializable;

public class Inserviente extends Persona implements Serializable {

    private int idUfficio;

    public Inserviente(int id, String nome, String cognome, double stipendio, int idUfficio) {
        super(id, nome, cognome, stipendio);
        this.idUfficio = idUfficio;
    }

    public int getIdUfficio() {
        return idUfficio;
    }

    public void setIdUfficio(int idUfficio) {
        this.idUfficio = idUfficio;
    }
}