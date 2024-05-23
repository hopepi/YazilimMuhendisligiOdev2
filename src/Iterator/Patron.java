package Iterator;

public class Patron {
    private CalisanListesi calisanListesi;

    public Patron() {
        this.calisanListesi = new CalisanListesi();
    }

    public void calisanEkle(Calisan calisan) {
        calisanListesi.calisanEkle(calisan);
    }

    public void calisanSil(Calisan calisan) {
        calisanListesi.calisanSil(calisan);
    }

    public void calisanlariListele() {
        Iterator iterator = calisanListesi.iterator();
        while (iterator.hasNext()) {
            Calisan calisan = iterator.next();
            System.out.println("Çalışan: " + calisan.getIsim());
        }
    }
}
