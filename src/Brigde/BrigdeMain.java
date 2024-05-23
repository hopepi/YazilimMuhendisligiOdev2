package Brigde;

public class BrigdeMain  {
    public static void main(String[] args) {

        // Sedan tipi BMW oluşturduk ve çıktısını fonksiyonla verdim.
        Car sedanBMW = new BMW(new Sedan());
        sedanBMW.detaylariGoster();

        // Suv tipi BMW oluşturduk ve çıktısını fonksiyonla verdim.
        Car suvBMW = new BMW(new SUV());
        suvBMW.detaylariGoster(); // Çıktı: BMW SUV.

        // Sedan tipi Toyota oluşturduk ve çıktısını fonksiyonla verdim.
        Car sedanToyota = new Toyota(new Sedan());
        sedanToyota.detaylariGoster();

        // Suv tipi Toyota oluşturduk ve çıktısını fonksiyonla verdim.
        Car suvToyota = new Toyota(new SUV());
        suvToyota.detaylariGoster();

    }
}