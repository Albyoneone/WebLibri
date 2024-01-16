package com.example.WebLibri;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

public class User {
    @Size(min = 1, max = 30)
    String name;
    @Size(min = 1, max = 30)
    String cognome;
    @Size(min = 6, max = 30)
    String username;
    @Size(min = 8, max = 16)
    String password;
    Boolean check;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
