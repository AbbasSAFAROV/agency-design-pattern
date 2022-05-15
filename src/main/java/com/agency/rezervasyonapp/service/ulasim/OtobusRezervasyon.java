package com.agency.rezervasyonapp.service.ulasim;


import lombok.*;

@ToString @Data @Setter
@AllArgsConstructor
@NoArgsConstructor
public class OtobusRezervasyon implements UlasimRezervasyon {

    private String nereden;
    private String nereye;
    private String fiyat;

    @Override
    public void rezervasyonOlustur() {
        System.out.println("otobus rezervasyonu olusturuldu!");
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
    public String getFiyat() {
        return fiyat;
    }
}
