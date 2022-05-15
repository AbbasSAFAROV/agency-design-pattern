package com.agency.rezervasyonapp.service.konaklama;

public class KonaklamaFactory {

    public static KonaklamaRezervasyon getInstance(KonaklamaTipi konaklamaTipi){
        switch (konaklamaTipi){
            case OTEL: return new OtelRezervasyon();
            case CADIR: return new CadirRezervasyon();
            default: throw new UnsupportedOperationException();
        }
    }

}
