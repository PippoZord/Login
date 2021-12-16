package com.login.User;

public class Scrutinatore extends User{

    public Scrutinatore(String nome, String cognome, CodFisc codFisc, String password) {
        super(nome, cognome, codFisc, password);
    }
    
    @Override
    public String toString() {
            return "\nSCRUTINATORE\nNOME: " + this.getName() + "\nCOGNOME: " + this.getSurname() + "\nUSERNAME: " + this.getCodFisc();
    }
}
