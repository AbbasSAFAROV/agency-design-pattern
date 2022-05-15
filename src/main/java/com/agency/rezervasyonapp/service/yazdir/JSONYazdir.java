package com.agency.rezervasyonapp.service.yazdir;

import com.agency.rezervasyonapp.service.Seyahat;

public class JSONYazdir implements Yazdir{
    @Override
    public void yazdir(Seyahat seyahat) {
        System.out.println("JSON ile yazdiriliyor");
        seyahat.seyahatOlustur();
    }
}
