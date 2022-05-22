package com.agency.rezervasyonapp.service.ulasim;

import lombok.*;

@ToString @Data
@AllArgsConstructor
@NoArgsConstructor
public class UcakRezervasyon implements UlasimRezervasyon {

    private String nereden;
    private String nereye;
    private Double fiyat;

    @Override
    public void rezervasyonOlustur() {
        System.out.println("ucus rezervasyonu olusturuldu!");
    }

    @Override
    public String getNereden() {
        return nereden;
    }

    @Override
    public String getNereye() {
        return nereye;
    }

    @Override
    public Double getFiyat() {
        return fiyat;
    }
}
