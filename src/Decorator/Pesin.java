package Decorator;

public class Pesin extends OdemeDecorator {
    public Pesin(Odeme odeme) {
        super(odeme);
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        System.out.println("Peşin ödeme yapıldı.");
    }
}