package Decorator;

public abstract class OdemeDecorator implements Odeme {
    private Odeme odeme;

    public OdemeDecorator(Odeme odeme) {
        this.odeme = odeme;
    }

    @Override
    public void odemeYap() {
        odeme.odemeYap();
    }
}