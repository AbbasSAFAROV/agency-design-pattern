package com.agency.rezervasyonapp.service.ulasim;

import com.agency.rezervasyonapp.service.Rezervasyon;

public interface UlasimRezervasyon extends Rezervasyon {

    String getNereden();
    String getNereye();
    Double getFiyat();
}
