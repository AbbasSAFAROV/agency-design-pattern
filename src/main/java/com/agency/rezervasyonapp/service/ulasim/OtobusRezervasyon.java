package com.agency.rezervasyonapp.service.ulasim;


import lombok.ToString;

@ToString
public class OtobusRezervasyon implements UlasimRezervasyon {
    @Override
    public void rezervasyonOlustur() {
        System.out.println("otobus rezervasyonu olusturuldu!");
    }

}
