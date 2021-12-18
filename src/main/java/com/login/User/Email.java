package com.login.User;

import java.util.Objects;

public class Email {
    
    private String email;

    public Email(String email){
        check(email);
        this.email = email;
    }

    private void check(String email) {
        Objects.requireNonNull(email);
        if (!email.contains("@"))
            throw new IllegalArgumentException("IT IS NOT AN  EMAIL");
    }

    public String getEmail(){
        return this.email;
    }


    @Override
    public String toString() {
        return this.email;
    }
}
