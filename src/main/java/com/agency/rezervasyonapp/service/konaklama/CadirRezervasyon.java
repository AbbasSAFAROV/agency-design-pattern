package com.agency.rezervasyonapp.service.konaklama;

import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CadirRezervasyon implements KonaklamaRezervasyon {

    private String lokasyon;
    private Double fiyat;

    @Override
    public void rezervasyonOlustur() {
        System.out.println("cadir rezervasyonu olusturuldu!");
    }

    @Override
    public String getLokasyon() {
        return lokasyon;
    }

    @Override
    public Double getFiyat() {
        return fiyat;
    }
}
