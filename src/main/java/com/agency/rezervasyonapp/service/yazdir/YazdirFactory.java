package com.agency.rezervasyonapp.service.yazdir;

public class YazdirFactory {

    public static Yazdir getInstance(YazdirmaTipi yazdirmaTipi){
        switch (yazdirmaTipi){
            case HTML: return new HTMLYazdir();
            case JSON: return new JSONYazdir();
            case XML: return new XMLYazdir();
            default: throw new UnsupportedOperationException();
        }
    }

}
