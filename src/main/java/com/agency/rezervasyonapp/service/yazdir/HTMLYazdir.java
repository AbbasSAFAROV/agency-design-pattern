package com.agency.rezervasyonapp.service.yazdir;

import com.agency.rezervasyonapp.service.Seyahat;

public class HTMLYazdir implements Yazdir{
    @Override
    public void yazdir(Seyahat seyahat) {
        System.out.println("HTML ile yazdiriliyor");
        seyahat.seyahatOlustur();
    }
}
