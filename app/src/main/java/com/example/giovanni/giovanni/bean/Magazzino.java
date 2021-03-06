package com.example.giovanni.giovanni.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Magazzino implements Serializable {

    private List<Articolo> articoli;

    public Magazzino() {
        this.articoli = new ArrayList<>();
    }

    public List<Articolo> getArticoli() {
        return articoli;
    }

    public void setArticoli(List<Articolo> articoli) {
        this.articoli = articoli;
    }

    public void addArticoli(Articolo articolo) {
        articoli.add(articolo);
    }
}