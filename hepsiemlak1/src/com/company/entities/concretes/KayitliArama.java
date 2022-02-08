package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

import java.sql.Date;
import java.sql.Time;

public class KayitliArama implements Entity {

    private Kullanici kullanici;
    private Kullanici arananKullanici;
    private Time time;
    private Date date;
    private Ilan ilan;

    public KayitliArama(Kullanici kullanici, Time time, Date date, Ilan ilan) {
        this.kullanici = kullanici;
        this.time = time;
        this.date = date;
        this.ilan = ilan;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Ilan getIlan() {
        return ilan;
    }

    public void setIlan(Ilan ilan) {
        this.ilan = ilan;
    }
}
