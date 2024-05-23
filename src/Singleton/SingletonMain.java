package Singleton;

import Brigde.Car;

import java.util.List;

public class SingletonMain {
    public static void main(String[] args) {
        // Araç verilerini işleyen sınıfı oluştur
        AracVerileri aracVerileri = new AracVerileri();

        // Araçları ekleyelim
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.suvToyota_Ekle();

        // Eklenen araçları listeleme işlemi
        List<Car> aracListesi = aracVerileri.getVeriListesi();
        System.out.println("Eklenen Araçlar:");
        for (int i = 0; i < aracListesi.size(); i++) {
            System.out.print((i+1) + ") ");
            aracListesi.get(i).detaylariGoster();
        }

        System.out.println();

        // İstediğimiz bir araç silelim
        aracVerileri.aracSil(1);
        System.out.println("2.Sıradaki araç silindi ");

        // Silindikten sonraki araç listesini gösterelim
        System.out.println("\nAraç silindikten sonra:");
        aracListesi = aracVerileri.getVeriListesi();
        for (int i = 0; i < aracListesi.size(); i++) {
            System.out.print((i+1) + ") ");
            aracListesi.get(i).detaylariGoster();
        }
    }
}
