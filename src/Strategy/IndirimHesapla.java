package Strategy;

public class IndirimHesapla {
    private IndirimHesaplamaStrategy indirimHesaplamaStrategy;

    public void setIndirimHesaplamaStrategy(IndirimHesaplamaStrategy indirimHesaplamaStrategy) {
        this.indirimHesaplamaStrategy = indirimHesaplamaStrategy;
    }
    public double IndirimTutar(double tutar) {
        return indirimHesaplamaStrategy.hesaplaIndirim(tutar);
    }
}
