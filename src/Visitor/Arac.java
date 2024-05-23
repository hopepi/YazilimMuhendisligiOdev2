package Visitor;

public class Arac implements Element {
    private String marka;
    private double fiyat;

    public Arac(String marka, double fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public double getFiyat() {
        return fiyat;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
