package com.example.giovanni.giovanni.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable {

    public int id;
    private String nome;
    private String cognome;
    private long matricola;
    private int numero;
    private String sesso;
    private String dataNascita;
    private String luogoNascita;
    private String provincia;
    private String msisdn;
    private String eta;
    private String username;
    private String email;
    private String codiceFiscale;
    private String password;
    private List<Gruppo> lista;
    private String tipo;
    private double stipendio;
    private double straordinario;
    private boolean checked;

    public Persona() {
        this.id = 0;
        this.nome = null;
        this.cognome = null;
        this.matricola = 0;
        this.numero = 0;
        this.sesso = null;
        this.dataNascita = null;
        this.luogoNascita = null;
        this.provincia = null;
        this.msisdn = null;
        this.eta = null;
        this.username = null;
        this.email = null;
        this.codiceFiscale = null;
        this.password = null;
        this.lista = new ArrayList<>();
        this.tipo = null;
        this.stipendio = 0.0;
        this.straordinario = 0.0;
        this.checked = false;
    }

    public Persona(String cognome) {
        this.cognome = cognome;
    }

    public Persona(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Persona(int id, String nome, String cognome, String msisdn) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.msisdn = msisdn;
    }

    public Persona(String nome, String cognome, int numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public Persona(String nome, String cognome, String sesso, String dataNascita, String luogoNascita, String provincia, String msisdn) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.provincia = provincia;
        this.msisdn = msisdn;
    }

    public Persona(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Persona(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Persona(int id, String email, String password, List<Gruppo> lista) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.lista = lista;
    }

    public Persona(String nome, String cognome, String msisdn, boolean checked) {
        this.nome = nome;
        this.cognome = cognome;
        this.msisdn = msisdn;
        this.checked = checked;
    }

    public Persona(String nome, String cognome, String msisdn, String tipo, boolean checked) {
        this.nome = nome;
        this.cognome = cognome;
        this.msisdn = msisdn;
        this.tipo = tipo;
        this.checked = checked;
    }

    /*
    public Persona(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = 0.0;
    }
    */

    public Persona(int id, String nome, String cognome, double stipendio) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public Persona(long matricola, double stipendio, double straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    public Persona(String nome, String username, String password) {
        this.nome = nome;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public long getMatricola() {
        return matricola;
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Gruppo> getLista() {
        return lista;
    }

    public void setLista(List<Gruppo> lista) {
        this.lista = lista;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStraordinario() {
        return straordinario;
    }

    public void setStraordinario(double straordinario) {
        this.straordinario = straordinario;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void initBand() {

        inserisci(new Gruppo("Nirvana", 3, 1));
        inserisci(new Gruppo("Parl Jam", 5, 2));
        inserisci(new Gruppo("Soundgarden", 4, 3));
        inserisci(new Gruppo("Stone Temple Pilots", 4, 4));
        inserisci(new Gruppo("Audioslave", 4, 5));
    }

    public static List<Persona> initPersone() {

        List<Persona> list = new ArrayList<>();
        list.add(new Persona("Giovanni", "Petito", "3331582355"));
        list.add(new Persona("Raffaele", "Petito", "3802689011"));
        list.add(new Persona("Angelina", "Basile", "3334392578"));
        list.add(new Persona("Vincenzo", "Petito", "3666872262"));
        list.add(new Persona("Teresa", "Petito", "3343540536"));
        list.add(new Persona("Ilenia", "Pragliola", "3343540536"));
        list.add(new Persona("Salvatore", "Pragliola", "3384672609"));
        list.add(new Persona("Giovanni", "Basile", "3884723340"));
        list.add(new Persona("Marco", "Basile", "3892148853"));
        list.add(new Persona("Antonio", "D'Ascia", "3315605694"));
        list.add(new Persona("Giovanni", "D'Ascia", "3331711437"));
        list.add(new Persona("Mariano", "Pinto", "3397016728"));
        list.add(new Persona("Pasquale", "Amato", "3665917760"));
        list.add(new Persona("Francesco", "Mongiello", "3299376402"));
        list.add(new Persona("Gianluigi", "Santillo", "3386124867"));
        list.add(new Persona("Daniele", "Musacchia", "3494977374"));

        return list;
    }

    private void inserisci(Gruppo gruppo) {
        lista.add(gruppo);
    }

    public boolean cercaGruppo(String nome) {
        for (Gruppo gruppo : lista) {
            if (nome.equalsIgnoreCase(gruppo.getNome())) {
                return true;
            }
        }
        return false;
    }

    public String returnGruppo(String input) {
        for (Gruppo gruppo : lista) {
            if (input.equalsIgnoreCase(gruppo.getNome())) {
                if (gruppo.getNome().equals("Stone Temple Pilots") || gruppo.getNome().equals("Audioslave")) {
                    return "gli " + gruppo.getNome() + ", numero componenti: " + gruppo.getComponenti();
                } else {
                    return "i " + gruppo.getNome() + ", numero componenti: " + gruppo.getComponenti();
                }
            }
        }
        return null;
    }

    public double paga(int oreStraordinario) {
        return stipendio = stipendio + oreStraordinario * straordinario;
    }

    public String stampa() {
        return "Dati dipendente {" +
                "matricola: " + getMatricola() +
                ", stipendio: " + getStipendio() +
                ", straordinario: " + getStraordinario() + '}';
    }
}