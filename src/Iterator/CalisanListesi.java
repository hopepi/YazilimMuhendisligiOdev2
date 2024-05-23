package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CalisanListesi {
    private List<Calisan> calisanlar;

    public CalisanListesi() {
        this.calisanlar = new ArrayList<>();
    }

    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    public void calisanSil(Calisan calisan) {
        calisanlar.remove(calisan);
    }

    public Iterator iterator() {
        return new CalisanIterator(calisanlar);
    }

    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }
}

