package com.agency.rezervasyonapp.service.konaklama;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString @Data
@AllArgsConstructor
@NoArgsConstructor
public class CadirRezervasyon implements KonaklamaRezervasyon {

    private String lokasyon;
    private String fiyat;

    @Override
    public void rezervasyonOlustur() {
        System.out.println("cadir rezervasyonu olusturuldu!");
    }

    @Override
    public String getLokasyon() {
        return lokasyon;
    }

    @Override
    public String getFiyat() {
        return fiyat;
    }
}
