package com.login.User;

public class Elettore extends User {

    private boolean hasVoted;
    
    public Elettore(String nome, String cognome, CodFisc codFisc, String password, boolean hasVoted) {
        super(nome, cognome, codFisc, password);
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
            return "NOME: " + this.getName() +"\nCOGNOME: " +this.getSurname() +"\nUSERNAME: "+this.getCodFisc() + "\nVOTATO: " + "NO";            
        return "NOME: " + this.getName() +"\nCOGNOME: " +this.getName() +"\nUSERNAME: "+this.getCodFisc() + "\nVOTATO: " + "SI";
    }
}
