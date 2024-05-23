package Visitor;

import Builder.Musteri;

import java.sql.SQLOutput;

public class VisitorMain {
    public static void main(String[] args) {
        // Deneme için ziyaretçi araç ve müşteri bilgileri oluşturuyoruz
        Arac arac = new Arac("BMW", 150000);
        Musteri musteri = new Musteri.Builder("Mauro", "İcardi", "12345678915", "5677891234")
                .adres("Ankara, Türkiye")
                .build();
        MusteriElement musteriElement = new MusteriElement(musteri);

        // Ziyaretçi oluşturduk
        Visitor aracRaporu = new RaporVisit();
        Visitor musteriRaporu = new RaporVisit();

        // Araca ve müşteriye ziyaretçileri uygulama işlemi
        arac.accept(aracRaporu);
        musteriElement.accept(musteriRaporu);
    }
}
