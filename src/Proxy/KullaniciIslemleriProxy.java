package Proxy;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class KullaniciIslemleriProxy implements KullaniciIslemleri{
    private RealKullanici realKullanici;
    private String dogruKullaniciAdi = "admin";
    private String dogruSifre = "1234";
    private int basarisizDenemeSayisi = 0;
    private static final int MAX_DENEME = 3;
    private LocalTime engellemeZamani;
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public KullaniciIslemleriProxy(RealKullanici realKullanici) {
        this.realKullanici = realKullanici;
    }



    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        logGirisDenemesi(kullaniciAdi);

        if (engellemeZamani != null && LocalTime.now().isBefore(engellemeZamani)) {
            System.out.println("Çok fazla başarısız giriş denemesi. Lütfen " + engellemeZamani + " saatine kadar bekleyin.");
            return;
        }

        if (dogrula(kullaniciAdi, sifre)) {
            realKullanici.girisYap(kullaniciAdi, sifre);
            basarisizDenemeSayisi = 0;
            engellemeZamani = null;
        } else {
            basarisizDenemeSayisi++;
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            if (basarisizDenemeSayisi >= MAX_DENEME) {
                engellemeZamani = LocalTime.now().plusHours(2);
                System.out.println("Çok fazla başarısız giriş denemesi. Lütfen " + engellemeZamani.format(timeFormatter) + " saatine kadar bekleyin.");
            }
        }
    }

    private boolean dogrula(String kullaniciAdi, String sifre) {
        return kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre);
    }

    private void logGirisDenemesi(String kullaniciAdi) {
        System.out.println("Giriş denemesi: " + kullaniciAdi + " - " + LocalTime.now().format(timeFormatter));
    }

}
