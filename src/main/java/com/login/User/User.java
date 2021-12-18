package com.login.User;
import java.sql.Date;


public abstract class User {
    
    private String nome, cognome, password, nascita, nazione;
    private final CodFisc codiceFiscale;
    private final Date data;
    private char sex;

    public User(String nome, String cognome, CodFisc codFisc, Date data, char sex, String nascita, String nazione, String password){
        this.nome = nome;
        this.data = data;
        this.sex = sex;
        this.cognome = cognome;
        this.nazione = nazione;
        this.codiceFiscale = codFisc;
        this.nascita = nascita;
        this.password = password;
    }

    public String getName(){
        return this.nome;
    }

    public String getSurname(){
        return this.cognome;
    }


    public CodFisc getCodFisc() {
        return this.codiceFiscale;
    }

    public String getPassword() {
        return this.password;
    }

    public Date getData() {
        return this.data;
    }

    public char getSex() {
        return this.sex;
    }

    public String getNascita(){
        return this.nascita;
    }

    public String getNazione(){
        return this.nazione;
    }
}

