package com.login.User;

public abstract class User {
    
    private String nome, cognome, password;
    private final CodFisc codiceFiscale;

    public User(String nome, String cognome, CodFisc codFisc, String password){
        this.nome = nome;
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
}

