package com.agency.rezervasyonapp.service.konaklama;


import com.agency.rezervasyonapp.service.konaklama.KonaklamaRezervasyon;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaTipi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString @Data
@AllArgsConstructor
@NoArgsConstructor
public class OtelRezervasyon implements KonaklamaRezervasyon {

    private String lokasyon;
    private Double fiyat;

    @Override
    public void rezervasyonOlustur() {
        System.out.println("otel rezervasyonu olusturuldu!");
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
