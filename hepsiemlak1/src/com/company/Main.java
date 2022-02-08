package com.company;

import com.company.entities.concretes.Favori;
import com.company.entities.concretes.Ilan;
import com.company.entities.concretes.Kullanici;
import com.company.entities.concretes.Mesaj;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ilan ekleme
        List<Ilan> ilanList=new ArrayList<>();
       Kullanici kullanici=new Kullanici("seymatezcan@hotmail.com");
       Ilan ilan=new Ilan();
       ilan.setKullanici(kullanici);
       ilan.setTitle("Kiralık daire");
       ilan.setSehir("İstanbul");
       ilan.setTip("2+1");
       ilan.setFiyat(2750L);
       ilan.setContent("Temiz, merkezi, metroya yürüyerek 15 dakika, ferah daire.");
       ilanList.add(ilan);

       Kullanici kullanici8=new Kullanici("emine@gmail.com");
       Ilan ilan5=new Ilan("İstanbul",2100L,"3+1");
       ilan5.setTitle("Sahibinden masrafsız kiralık daire");
       ilan5.setContent("Aidat v.b apartman masrafı minimumda. Otobüs durağına 2 dakika. Kombili.");
       ilan5.setKullanici(kullanici8);
       ilanList.add(ilan5);

        //kullanıcı ekleme
        Set<Kullanici>kullaniciSet=new HashSet<>();
        Kullanici kullanici1=new Kullanici();
        kullanici1.setEmail("ayse.sari@gmail.com");
        kullaniciSet.add(kullanici1);

        //favori ekleme
        Set<Favori>favoriSet=new HashSet<>();
        Kullanici kullanici2=new Kullanici("ayse.sari@gmail.com");
        Ilan ilan1=new Ilan();
        ilan1.setKullanici(kullanici2);
        ilan1.setTitle("Satılık daire");
        Favori favori=new Favori();
        favori.setIlan(ilan1);
        favori.setKullanici(kullanici2);
        favoriSet.add(favori);

        Kullanici kullanici6=new Kullanici("sadi@hotmail.com");
        Favori favori1=new Favori(kullanici6,ilan1);
        favoriSet.add(favori1);

        Favori favori2=new Favori(kullanici1,ilan);
        favoriSet.add(favori2);

        //mesaj ekleme
        List<Mesaj>mesajList=new ArrayList<>();
        Kullanici kullanici3=new Kullanici();
        kullanici3.setEmail("ayse@hotmail.com");
        Mesaj mesaj=new Mesaj();
        mesaj.setContent("Merhabalar, detaylar için ne zaman görüşebiliriz?");
        mesaj.setKullanici(kullanici3);
        mesaj.setGonderilenKullanici(kullanici2);
        mesaj.setTitle("Detaylı bilgi");
        mesajList.add(mesaj);

        Kullanici kullanici4=new Kullanici("sule@hotmail.com");
        Mesaj mesaj1=new Mesaj(kullanici4,kullanici3,"Hala satılık ise görüşmek istiyorum","Satılık mı?");
        mesajList.add(mesaj1);

        Kullanici kullanici5=new Kullanici("faruk@hotmail.com");
        Mesaj mesaj2=new Mesaj(kullanici5,kullanici8,"Fiyatta anlaşırsak hemen almak istiyorum","Pazarlık?");
        mesajList.add(mesaj2);

        Kullanici kullanici7=new Kullanici("feyza@hotmail.com");
        Mesaj mesaj3=new Mesaj(kullanici7,kullanici,"Merhaba, ev kaç yıllık acaba?","Bina yaşı?");
        mesajList.add(mesaj3);

        Kullanici kullanici9=new Kullanici("fatih@gmail.com");
        Mesaj mesaj4=new Mesaj(kullanici9,kullanici6,"Merhaba, ciddi alıcıyım. Pazarlık payı var mı?","Pazarlık?");
        mesaj4.setGonderilenKullanici(kullanici6);
        mesajList.add(mesaj4);

        //istanbulda 2+1/3+1 ve fiyatı 3000 in altında olan ilanları yazdıran loop
        for(Ilan i:ilanList){
            if(i.getTip()=="2+1"||i.getTip()=="3+1"&&i.getSehir()=="İstanbul"&&i.getFiyat()<3000){
                System.out.println(i.getKullanici()+" "+i.getSehir()+" "+i.getTip()+" "+i.getFiyat()+" "+i.getTitle()+" "+i.getContent());
            }
        }

        //sistemdeki tüm mesajları yazdıran loop
        for(Mesaj m:mesajList){
            System.out.println(m.getKullanici()+" "+m.getContent()+" "+m.getGonderilenKullanici());
        }

        //ayse.sari@gmail.com kullanıcısının favori ilanlarını yazdıran loop
        for(Favori f:favoriSet){
            if(f.getKullanici()=="ayse.sari@gmail.com"){
                System.out.println(f.getKullanici()+" "+f.getIlan());
            }
        }

    }

}

