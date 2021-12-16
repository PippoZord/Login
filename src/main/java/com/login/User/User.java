package com.login.User;
import java.sql.Date;


public abstract class User {
    
    private String nome, cognome, password;
    private final CodFisc codiceFiscale;
    private final Date data;
    private char sex;

    public User(String nome, String cognome, CodFisc codFisc, Date data, char sex, String password){
        this.nome = nome;
        this.data = data;
        this.sex = sex;
        this.cognome = cognome;
        this.codiceFiscale = codFisc;
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
}

