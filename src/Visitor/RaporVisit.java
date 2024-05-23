package Visitor;

public class RaporVisit implements Visitor {
    @Override
    public void visit(Arac arac) {
        System.out.println("ARAÇ RAPORU");
        System.out.println("Marka: " + arac.getMarka());
        System.out.println("Fiyat: " + arac.getFiyat());
        System.out.println();
    }

    @Override
    public void visit(MusteriElement musteriElement) {
        System.out.println("MÜŞTERİ RAPORU");
        System.out.println("Ad: " + musteriElement.getMusteri().getAd());
        System.out.println("Soyad: " + musteriElement.getMusteri().getSoyad());
        System.out.println("TC No: " + musteriElement.getMusteri().getTcno());
        System.out.println("Telefon No: " + musteriElement.getMusteri().getTelno());
    }
}
