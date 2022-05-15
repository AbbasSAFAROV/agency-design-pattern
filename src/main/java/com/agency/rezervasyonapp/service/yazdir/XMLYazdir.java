package com.agency.rezervasyonapp.service.yazdir;

import com.agency.rezervasyonapp.service.Seyahat;

public class XMLYazdir implements Yazdir{
    @Override
    public void yazdir(Seyahat seyahat) {
        System.out.println("XML ile yazdiriliyor");
        seyahat.seyahatOlustur();

    }
}
