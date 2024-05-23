package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        // İndirim hesaplama sınıfını oluştur
        IndirimHesapla indirimHesapla = new IndirimHesapla();

        // Kupon indirim stratejisi
        System.out.println("Bireysel anlaşma kodu ile aldığınız indirim fiyatı:");
        indirimHesapla.setIndirimHesaplamaStrategy(new KuponIndirim("SUAT123"));
        double kuponIndirimi = indirimHesapla.IndirimTutar(1000);
        System.out.println("Kupon indirimi: " + kuponIndirimi);

        System.out.println("Süper Cuma kodu fırsati ile aldığınız indirim fiyatı:");
        indirimHesapla.setIndirimHesaplamaStrategy(new KuponIndirim("SUPERCUMA"));
        double kuponIndirimi2 = indirimHesapla.IndirimTutar(1000);
        System.out.println("Kupon indirimi: " + kuponIndirimi2);

        // Yüzdelik indirim stratejisi
        System.out.println("Yüzdelik fırsatı ile aldığınız indirim fiyatı:");
        indirimHesapla.setIndirimHesaplamaStrategy(new YuzdelikIndirim(20));
        double yuzdelikIndirim = indirimHesapla.IndirimTutar(1000);
        System.out.println("Yüzdelik indirim: " + yuzdelikIndirim);


    }
}
