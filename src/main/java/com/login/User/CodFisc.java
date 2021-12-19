package com.login.User;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class CodFisc {
    
    private final String codFisc;

    public CodFisc(String codFisc){
        Objects.requireNonNull(codFisc);
        this.codFisc = codFisc;
    }

    public static CodFisc createCodFisc(String nome, String Cognome, String nazione, String comune, Calendar data, String sex){
        data.set(2000, 7, 11);;
        System.out.println(data.getTime());
        return null;
    }

    public String getCodFisc(){
        return this.codFisc;
    }

    @Override
    public String toString() {
        return this.codFisc;
    }
}
