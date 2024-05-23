package Observer;

import Builder.Musteri;

public class ObserverMain {
    public static void main(String[] args) {
        // Doğrulama merkezi oluşturuyoruz
        DogrulamaMerkezi dogrulamaMerkezi = new DogrulamaMerkezi();

        // Telefon doğrulama observer'ı oluşturuyoruz
        TelefonDogrulamaObserver telefonDogrulamaObserver = new TelefonDogrulamaObserver("5112223344");

        // Observer'ı doğrulama merkezine ekleme işlemini gerçekleştiriyoruz
        dogrulamaMerkezi.addObserver(telefonDogrulamaObserver);

        // Denemek için bir müşteri oluşturuyoruz
        Musteri musteri = new Musteri.Builder("İlk", "Müşteri", "12345678913", "5112223344")
                .adres("Ankara, Türkiye")
                .build();

        // Doğrulama işlemini başlatıyoruz ve çıktısını alıyoruz
        dogrulamaMerkezi.dogrulamaBaslat(musteri);
    }
}
