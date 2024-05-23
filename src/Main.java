import Brigde.*;
import Builder.Musteri;
import Decorator.*;
import Factory.Rezervasyon;
import Factory.RezervasyonFactory;
import Iterator.Calisan;
import Iterator.Patron;
import Observer.DogrulamaMerkezi;
import Observer.TelefonDogrulamaObserver;
import Proxy.KullaniciIslemleriProxy;
import Proxy.RealKullanici;
import Singleton.AracVerileri;
import Strategy.IndirimHesapla;
import Strategy.KuponIndirim;
import Strategy.YuzdelikIndirim;
import Visitor.Arac;
import Visitor.MusteriElement;
import Visitor.RaporVisit;
import Visitor.Visitor;

public class Main {
    public static void main(String[] args) {

        AracVerileri aracVerileri = new AracVerileri();
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.sedanBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.suvBMW_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.suvToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();
        aracVerileri.sedanToyota_Ekle();





        RezervasyonFactory rezervasyonFactory= new RezervasyonFactory();

        rezervasyonFactory.rezervasyonYap();



        //Müşteri oluşturma
        Musteri musteri1 = new Musteri.Builder("Umut", "Özkan", "12345678901", "05001234567")
                .adres("Esenler")
                .build();
        System.out.println("Ad: " + musteri1.getAd());
        System.out.println("Soyad: " + musteri1.getSoyad());
        System.out.println("TC No: " + musteri1.getTcno());
        System.out.println("Tel No: " + musteri1.getTelno());
        System.out.println("Adres: " + musteri1.getAdres());

        Odeme nakit = new NakitOdeme();
        nakit.odemeYap();

        // Kredi kartı ödeme
        Odeme krediKarti = new KrediKarti();
        krediKarti.odemeYap();

        // Havale ödemesi
        Odeme havale = new HavaleOdeme(new NakitOdeme());
        havale.odemeYap();

        // Peşin indirimli ödeme
        Odeme pesinIndirim = new Pesin(new KrediKarti());
        pesinIndirim.odemeYap();

        Odeme taksit = new Taksit(new NakitOdeme(),5);
        taksit.odemeYap();


        IndirimHesapla indirimHesaplama = new IndirimHesapla();

        indirimHesaplama.setIndirimHesaplamaStrategy(new YuzdelikIndirim(25));
        double sepetToplami1=1000.0;
        double yuzdelikHesaplamaTest = indirimHesaplama.IndirimTutar(sepetToplami1);
        System.out.println("Tutar: " + sepetToplami1 + " TL, İndirim: " + yuzdelikHesaplamaTest + " TL");

        indirimHesaplama.setIndirimHesaplamaStrategy(new KuponIndirim("SUAT123"));
        double sepetToplami2=1000.0;
        double KuponHesaplamaTest = indirimHesaplama.IndirimTutar(sepetToplami2);
        System.out.println("Tutar: " + sepetToplami2 + " TL, İndirim: " + KuponHesaplamaTest + " TL");

        RealKullanici gercekKullaniciHizmeti = new RealKullanici();
        KullaniciIslemleriProxy kullaniciHizmetiProxy = new KullaniciIslemleriProxy(gercekKullaniciHizmeti);

        // Geçerli kimlik bilgileriyle giriş
        kullaniciHizmetiProxy.girisYap("admin", "1234");

        // Geçersiz kimlik bilgileriyle giriş
        kullaniciHizmetiProxy.girisYap("text", "321");

        // Geçersiz kimlik bilgileriyle tekrar giriş denemesi
        kullaniciHizmetiProxy.girisYap("ewt", "14214");

        // çok fazla başarısız deneme
        kullaniciHizmetiProxy.girisYap("user", "421214");

        DogrulamaMerkezi dogrulamaServisi = new DogrulamaMerkezi();
        TelefonDogrulamaObserver telefonDogrulamaObserver=new TelefonDogrulamaObserver(musteri1.getTelno());
        dogrulamaServisi.addObserver(telefonDogrulamaObserver);

        dogrulamaServisi.dogrulamaBaslat(musteri1);


        Arac arac1 = new Arac("Toyota", 10000);
        Arac arac2 = new Arac("BMW", 12000);

        MusteriElement musteriElement = new MusteriElement(musteri1);

        Visitor raporlamaVisitor = new RaporVisit();

        arac1.accept(raporlamaVisitor);
        arac2.accept(raporlamaVisitor);
        musteriElement.accept(raporlamaVisitor);

        Patron patron = new Patron();

        Calisan calisan1 = new Calisan("Ahmet");
        Calisan calisan2 = new Calisan("Ayşe");
        Calisan calisan3 = new Calisan("Mehmet");

        patron.calisanEkle(calisan1);
        patron.calisanEkle(calisan2);
        patron.calisanEkle(calisan3);

        System.out.println("Çalışan Listesi:");
        patron.calisanlariListele();

        patron.calisanSil(calisan2);

        System.out.println("\nAyşe çıkarıldıktan sonra Çalışan Listesi:");
        patron.calisanlariListele();
    }
}
