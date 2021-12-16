package com.login.User;

import java.sql.Date;

public class Scrutinatore extends User{

    public Scrutinatore(String nome, String cognome, CodFisc codFisc, Date data, char sex, String password) {
        super(nome, cognome, codFisc, data, sex, password);
    }
    
    @Override
    public String toString() {
            return "\nSCRUTINATORE\nNOME: " + this.getName() + "\nCOGNOME: " + this.getSurname() + "\nUSERNAME: " + this.getCodFisc()+ "\nDATA DI NASCITA: " + this.getData() + "\nSEX: " + this.getSex();
    }
}
