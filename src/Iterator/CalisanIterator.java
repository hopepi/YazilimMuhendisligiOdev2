package Iterator;

import java.util.List;

public class CalisanIterator implements Iterator{
    private List<Calisan> calisanListesi;
    private int position;

    public CalisanIterator(List<Calisan> calisanListesi) {
        this.calisanListesi = calisanListesi;
    }

    @Override
    public boolean hasNext() {
        return position < calisanListesi.size();
    }

    @Override
    public Calisan next() {
        if (this.hasNext()) {
            return calisanListesi.get(position++);
        }
        return null;
    }
}
