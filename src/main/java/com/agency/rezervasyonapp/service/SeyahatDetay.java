package com.agency.rezervasyonapp.service;


import com.agency.rezervasyonapp.entity.Yolcu;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaRezervasyon;
import com.agency.rezervasyonapp.service.ulasim.UlasimRezervasyon;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data @ToString @Builder
public class SeyahatDetay {
    private Yolcu yolcu;
    private String nereden;
    private String nereye;
    private Date gidis;
    private Date donus;
    private String ulasimTipi;
    private String konaklamaTipi;
    private Double fiyat;

}
