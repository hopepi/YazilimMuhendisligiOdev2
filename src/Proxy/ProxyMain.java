package Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        // Gerçek kullanıcıyı oluştur
        RealKullanici realKullanici = new RealKullanici();

        // Proxy kullanıcı işlemlerini oluştur ve gerçek kullanıcıyı parametre olarak ver
        KullaniciIslemleriProxy kullaniciProxy = new KullaniciIslemleriProxy(realKullanici);

        // Başarılı giriş denemesi
        System.out.println("----- Başarılı Giriş -----");
        kullaniciProxy.girisYap("admin", "1234");

        // Başarısız giriş denemesi
        System.out.println("\n----- Başarısız Giriş Denemeleri -----");
        kullaniciProxy.girisYap("hacker", "wrongpassword");
        kullaniciProxy.girisYap("admin", "wrongpassword");
        kullaniciProxy.girisYap("admin", "wrongpassword");

        // Engellenen giriş denemesi
        System.out.println("\n----- Engellenen Giriş Denemesi -----");
        kullaniciProxy.girisYap("admin", "wrongpassword");
        kullaniciProxy.girisYap("admin", "wrongpassword");

        // Engellenme süresinin geçmesi ve tekrar giriş denemesi
        System.out.println("\n----- Engellenme Süresinin Geçmesi -----");
        kullaniciProxy.girisYap("admin", "1234");
    }
}
