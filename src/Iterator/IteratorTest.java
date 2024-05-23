package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
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
