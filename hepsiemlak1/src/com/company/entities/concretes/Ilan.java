package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

import java.sql.Time;
import java.util.Date;

public class Ilan implements Entity {

    private String title;
    private Date date;
    private Time time;
    private String content;
    private String sehir;
    private String ilce;
    private String mahalle;
    private String sokak;
    private String cadde;
    private Kullanici kullanici;
    private Long fiyat;


    public Ilan() {
    }

    public Ilan(String sehir, Long fiyat, String tip) {
        this.sehir = sehir;
        this.fiyat = fiyat;
        this.tip = tip;
    }

    public Ilan(String title, Date date, Time time, String content, String sehir, String ilce, String mahalle, String sokak, String cadde, Kullanici kullanici) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.content = content;
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.cadde = cadde;
        this.kullanici = kullanici;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getKullanici() {
        return kullanici.getEmail();
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Long getFiyat() {
        return fiyat;
    }

    public void setFiyat(Long fiyat) {
        this.fiyat = fiyat;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    private String tip;

    public Ilan(String title) {
        this.title = title;
    }
}
