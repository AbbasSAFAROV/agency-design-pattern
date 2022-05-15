package com.agency.rezervasyonapp;

import com.agency.rezervasyonapp.service.*;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaFactory;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaRezervasyon;
import com.agency.rezervasyonapp.service.konaklama.KonaklamaTipi;
import com.agency.rezervasyonapp.service.konaklama.OtelRezervasyon;
import com.agency.rezervasyonapp.service.ulasim.UlasimTipi;
import com.agency.rezervasyonapp.service.ulasim.OtobusRezervasyon;
import com.agency.rezervasyonapp.service.ulasim.UlasimFactory;
import com.agency.rezervasyonapp.service.ulasim.UlasimRezervasyon;
import com.agency.rezervasyonapp.service.yazdir.Yazdir;
import com.agency.rezervasyonapp.service.yazdir.YazdirFactory;
import com.agency.rezervasyonapp.service.yazdir.YazdirmaTipi;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
@RequiredArgsConstructor
public class RezervasyonAppApplication implements CommandLineRunner {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(RezervasyonAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Lütfen ulasim turu seciniz: "+ Arrays.toString(UlasimTipi.values()));
        UlasimTipi ulasimTipi = UlasimTipi.valueOf(scanner.nextLine());

        UlasimRezervasyon ulasimRezervasyon = UlasimFactory.getInstance(ulasimTipi);

        System.out.println("Lütfen Konaklama turu seciniz: "+ Arrays.toString(KonaklamaTipi.values()));
        KonaklamaTipi konaklamaTipi = KonaklamaTipi.valueOf(scanner.nextLine());

        KonaklamaRezervasyon konaklamaRezervasyon = KonaklamaFactory.getInstance(konaklamaTipi);

        System.out.println("Lütfen Yazdirma turu seciniz: "+ Arrays.toString(YazdirmaTipi.values()));
        YazdirmaTipi yazdirmaTipi = YazdirmaTipi.valueOf(scanner.nextLine());

        Yazdir yazdir = YazdirFactory.getInstance(yazdirmaTipi);


        Seyahat seyahat = new Seyahat(ulasimRezervasyon,konaklamaRezervasyon);

        seyahat.seyahatOlustur();
        yazdir.yazdir();


    }
}
