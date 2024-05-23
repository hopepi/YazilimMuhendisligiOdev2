package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        // Kredi kartı ile ödeme seçeneği
        Odeme krediKarti = new KrediKarti();
        krediKarti.odemeYap();

        System.out.println();

        // Nakit ödeme seçeneği
        Odeme nakitOdeme = new NakitOdeme();
        nakitOdeme.odemeYap();

        System.out.println();

        // Havale ile ödeme (Kredi kartı ile ödeme üzerine havale seçeneği)
        Odeme havaleKrediKarti = new HavaleOdeme(new KrediKarti());
        havaleKrediKarti.odemeYap();

        System.out.println();

        // Peşin ödeme (Nakit ödeme üzerine peşin seçeneği)
        Odeme pesinNakit = new Pesin(new NakitOdeme());
        pesinNakit.odemeYap();

        System.out.println();

        // 3 taksit seçeneği (Nakit ödeme üzerine 3 taksit yapmayı seçti.)
        Odeme taksitliNakit = new Taksit(new NakitOdeme(), 3);
        taksitliNakit.odemeYap();


    }
}
