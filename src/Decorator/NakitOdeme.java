package Decorator;

public class NakitOdeme implements Odeme {
    @Override
    public void odemeYap() {
        System.out.println("Nakit ödeme yapıldı.");
    }
}
