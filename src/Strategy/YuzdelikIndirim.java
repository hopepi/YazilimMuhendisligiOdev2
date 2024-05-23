package Strategy;

public class YuzdelikIndirim implements IndirimHesaplamaStrategy{
    private int indirimOran=0;
    public YuzdelikIndirim(int indirim){
        this.indirimOran=indirim;

    }
    @Override
    public double hesaplaIndirim(double tutar) {
        return tutar * (indirimOran/100.0);
    }

}
