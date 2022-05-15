package com.agency.rezervasyonapp.service.ulasim;

import lombok.ToString;

@ToString
public class UcakRezervasyon implements UlasimRezervasyon {
    @Override
    public void rezervasyonOlustur() {
        System.out.println("ucus rezervasyonu olusturuldu!");
    }

}
