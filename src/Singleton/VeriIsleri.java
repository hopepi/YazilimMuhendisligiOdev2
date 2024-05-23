package Singleton;

import Brigde.Car;

import java.util.ArrayList;
import java.util.List;

public class VeriIsleri {
    // Singleton instance
    private static VeriIsleri instance;
    private List<Car> veriListesi;

    private VeriIsleri() {
        veriListesi = new ArrayList<>();
    }

    public static synchronized VeriIsleri getInstance() {
        if (instance == null) {
            instance = new VeriIsleri();
        }
        return instance;
    }

    public void veriEkle(Car veri) {
        veriListesi.add(veri);
    }

    public List<Car> getVeriListesi() {
        return veriListesi;
    }

    public void listeyiTemizle() {
        veriListesi.clear();
    }
}
