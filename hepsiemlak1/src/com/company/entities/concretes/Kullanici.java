package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

import java.util.*;

public class Kullanici implements Entity {


    private String email;
    private String sifre;

    public Kullanici() {
    }

    public Kullanici(String email) {
        this.email = email;
    }

    public Kullanici(String email, String sifre) {
        this.email = email;
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
