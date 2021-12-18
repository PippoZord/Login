package com.login.User;

import java.util.Objects;

public class CodFisc {
    
    private final String codFisc;

    public CodFisc(String codFisc){
        Objects.requireNonNull(codFisc);
        this.codFisc = codFisc;
    }

    public String getCodFisc(){
        return this.codFisc;
    }

    @Override
    public String toString() {
        return this.codFisc;
    }
}
