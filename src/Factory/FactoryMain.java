package Factory;

import Singleton.AracVerileri;


public class FactoryMain {
    public static void main(String[] args) {
        RezervasyonFactory rezervasyonFactory = new RezervasyonFactory();
        AracVerileri aracVerileri = new AracVerileri();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.sedanBMW_Ekle();
        rezervasyonFactory.rezervasyonYap();
    }
}
