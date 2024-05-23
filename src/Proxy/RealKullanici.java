package Proxy;

public class RealKullanici implements KullaniciIslemleri{
    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        System.out.println(kullaniciAdi + " kullanıcısı başarıyla giriş yaptı.");
    }
}
