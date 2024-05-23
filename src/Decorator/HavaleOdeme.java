package Decorator;

public class HavaleOdeme extends OdemeDecorator {
    public HavaleOdeme(Odeme odeme) {
        super(odeme);
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        System.out.println("Havale ile ödeme yapıldı.");
    }
}