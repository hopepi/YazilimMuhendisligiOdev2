package Builder;

public class BuilderMain {
    public static void main(String[] args) {
        // İlk müşteri nesnesini oluşturduk.
        Musteri musteri1 = new Musteri.Builder("Enes", "Çakır", "12345678911", "5331525757")
                .adres("İstanbul, Türkiye")
                .build();

        // İkinci müşteri nesnesini oluşturduk
        Musteri musteri2 = new Musteri.Builder("Umut", "Özkan", "12345678912", "5370347852")
                .adres("İstanbul, Türkiye")
                .build();

        // Oluşturduğumuz müşteri nesnelerindeki müşterilerin bilgilerini ekrana yazdırıyoruz
        System.out.println("Musteri 1:");
        System.out.println("Ad: " + musteri1.getAd());
        System.out.println("Soyad: " + musteri1.getSoyad());
        System.out.println("TC No: " + musteri1.getTcno());
        System.out.println("Tel No: " + musteri1.getTelno());
        System.out.println("Adres: " + musteri1.getAdres());

        System.out.println();

        System.out.println("Musteri 2:");
        System.out.println("Ad: " + musteri2.getAd());
        System.out.println("Soyad: " + musteri2.getSoyad());
        System.out.println("TC No: " + musteri2.getTcno());
        System.out.println("Tel No: " + musteri2.getTelno());
        System.out.println("Adres: " + musteri2.getAdres());

    }
}
