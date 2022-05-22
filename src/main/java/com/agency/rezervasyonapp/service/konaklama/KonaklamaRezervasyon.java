package com.agency.rezervasyonapp.service.konaklama;

import com.agency.rezervasyonapp.service.Rezervasyon;

public interface KonaklamaRezervasyon extends Rezervasyon {
    String getLokasyon();
    Double getFiyat();
}
