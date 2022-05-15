package com.agency.rezervasyonapp.service.konaklama;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString
public class CadirRezervasyon implements KonaklamaRezervasyon {
    @Override
    public void rezervasyonOlustur() {
        System.out.println("cadir rezervasyonu olusturuldu!");
    }

}
