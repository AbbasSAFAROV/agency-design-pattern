package com.agency.rezervasyonapp.service.konaklama;


import com.agency.rezervasyonapp.service.konaklama.KonaklamaRezervasyon;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaTipi;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
public class OtelRezervasyon implements KonaklamaRezervasyon {
    @Override
    public void rezervasyonOlustur() {
        System.out.println("otel rezervasyonu olusturuldu!");
    }

}
