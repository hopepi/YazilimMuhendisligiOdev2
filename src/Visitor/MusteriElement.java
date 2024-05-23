package Visitor;

import Builder.Musteri;

public class MusteriElement implements Element {
    private Musteri musteri;

    public MusteriElement(Musteri musteri) {
        this.musteri = musteri;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
