package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

public class Mesaj implements Entity {

    private Kullanici kullanici;
    private String content;
    private String title;
    private Kullanici gonderilenKullanici=new Kullanici();

    public Mesaj(Kullanici kullanici, String content, String title) {
        this.kullanici = kullanici;
        this.content = content;
        this.title = title;
    }

    public Mesaj(Kullanici kullanici, Kullanici gonderilenKullanici, String content, String title) {
        this.kullanici = kullanici;
        this.content = content;
        this.title = title;
        this.gonderilenKullanici = gonderilenKullanici;
    }

    public Mesaj(String title) {
        this.title = title;
    }

    public Mesaj() {
    }

    public String getGonderilenKullanici() {
        return gonderilenKullanici.getEmail();
    }

    public void setGonderilenKullanici(Kullanici gonderilenKullanici) {
        this.gonderilenKullanici = gonderilenKullanici;
    }

    public String getKullanici() {
        return kullanici.getEmail();
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
