package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

public class Favori implements Entity {

    private Kullanici kullanici;
    private Ilan ilan;

    public Favori() {
    }

    public Favori(Kullanici kullanici, Ilan ilan) {
        this.kullanici = kullanici;
        this.ilan = ilan;
    }

    public String getKullanici() {
        return kullanici.getEmail();
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String getIlan() {
        return ilan.getTitle()+" "+ilan.getContent();

    }

    public void setIlan(Ilan ilan) {
        this.ilan = ilan;
    }
}
