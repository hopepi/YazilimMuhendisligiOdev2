package Decorator;

public class KrediKarti implements Odeme{

    @Override
    public void odemeYap() {
        System.out.println("Kredi kartı ile ödeme yapıldı.");
    }
}
