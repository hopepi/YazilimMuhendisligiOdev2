package Singleton;

import Brigde.*;

import java.util.List;

public class AracVerileri {
    private VeriIsleri veriIsleri = VeriIsleri.getInstance();
    private Car sedanBMW = new BMW(new Sedan());
    private Car suvBMW = new BMW(new SUV());
    private Car suvToyota = new Toyota(new SUV());
    private Car sedanToyota = new Toyota(new Sedan());


    public void sedanBMW_Ekle(){
        veriIsleri.veriEkle(sedanBMW);
    }
    public void suvBMW_Ekle(){
        veriIsleri.veriEkle(suvBMW);
    }
    public void sedanToyota_Ekle(){
        veriIsleri.veriEkle(sedanToyota);
    }
    public void suvToyota_Ekle(){
        veriIsleri.veriEkle(suvToyota);
    }
    public void aracSil(int index){
        veriIsleri.getVeriListesi().remove(index);
    }
    public List<Car> getVeriListesi() {
        return veriIsleri.getVeriListesi();
    }

}
