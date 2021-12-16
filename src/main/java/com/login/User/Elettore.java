package com.login.User;

import java.sql.Date;

public class Elettore extends User {

    private boolean hasVoted;
    
    public Elettore(String nome, String cognome, CodFisc codFisc, Date data, char sex, String password, boolean hasVoted) {
        super(nome, cognome, codFisc, data, sex, password);
        this.hasVoted = hasVoted;
    }
    

    public boolean hasVoted(){
        return hasVoted;
    }

    public void vote(){
        if (hasVoted == false);
            hasVoted = true;
    }

    @Override
    public String toString(){
        if (hasVoted == false)
            return "\nELETTORE\nNOME: " + this.getName() +"\nCOGNOME: " +this.getSurname() +"\nUSERNAME: "+this.getCodFisc() +"\nDATA DI NASCITA: " + this.getData() + "\nSEX: " + this.getSex() + "\nVOTATO: " + "NO";            
        return "\nELETTORE\nNOME: " + this.getName() + "\nCOGNOME: " + this.getSurname() + "\nUSERNAME: " + this.getCodFisc()+ "\nDATA DI NASCITA: " + this.getData() + "\nSEX: " + this.getSex() + "\nVOTATO: " + "SI";
    }
}
