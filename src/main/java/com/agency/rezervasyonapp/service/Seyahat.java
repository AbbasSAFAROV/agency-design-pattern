package com.agency.rezervasyonapp.service;

import com.agency.rezervasyonapp.service.konaklama.KonaklamaRezervasyon;
import com.agency.rezervasyonapp.service.ulasim.UlasimRezervasyon;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data @ToString
@NoArgsConstructor
public class Seyahat {

    private UlasimRezervasyon ulasimRezervasyon;
    private KonaklamaRezervasyon konaklamaRezervasyon;

    public Seyahat(UlasimRezervasyon ulasimRezervasyon, KonaklamaRezervasyon konaklamaRezervasyon) {
        this.ulasimRezervasyon = ulasimRezervasyon;
        this.konaklamaRezervasyon = konaklamaRezervasyon;
    }

    public void seyahatOlustur(){
        ulasimRezervasyon.rezervasyonOlustur();
        konaklamaRezervasyon.rezervasyonOlustur();
    }

    public List<String> uygunUlasimVeKonaklamaListele(){
        return null;
    }

}
