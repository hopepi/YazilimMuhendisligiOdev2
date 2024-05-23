package Strategy;

public class KuponIndirim implements IndirimHesaplamaStrategy{
    private String kuponKodu;

    public KuponIndirim(String kuponKodu) {
        this.kuponKodu = kuponKodu;
    }
    @Override
    public double hesaplaIndirim(double tutar) {
        if (kuponKodu.equals("SUAT123")) {
            return 200.0;
        } else if (kuponKodu.equals("SUPERCUMA")) {
            return 150.0;
        }
        return 0.0; //Geçersiz Kupon
    }
}
