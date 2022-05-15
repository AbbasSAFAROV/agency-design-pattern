package com.agency.rezervasyonapp.service.ulasim;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public class UlasimFactory {

    public static UlasimRezervasyon getInstance(UlasimTipi ulasimTipi){
        switch (ulasimTipi){
            case UCAK: return new UcakRezervasyon();
            case OTOBUS: return new OtobusRezervasyon();
            default: throw new UnsupportedOperationException();
        }
    }


    /*private final Map<UlasimTipi, UlasimRezervasyon> nesneler;
    public UlasimFactory(List<UlasimRezervasyon> rezervasyons){
        //this.nesneler = rezervasyons.stream().collect(Collectors.toMap(UlasimRezervasyon::getUlasimTipi, Function.identity()));
        this.nesneler = null;
    }

    public UlasimRezervasyon getUlasimTipi(UlasimTipi tip){
        return nesneler.get(tip);
    }*/

}
