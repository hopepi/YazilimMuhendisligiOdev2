package Decorator;

public class Taksit extends OdemeDecorator{
    private int taksitSayisi=0;
    public Taksit(Odeme odeme,int taksitSayisi) {
        super(odeme);
        this.taksitSayisi=taksitSayisi;
    }

    @Override
    public void odemeYap() {
        super.odemeYap();
        if (taksitSayisi<=0){
            System.out.println("Hatalı bir değer girildi");
        }else{
            System.out.println("Ödemeniz "+taksitSayisi+" ay taksitlendirilmiştir");
        }
    }

    public int getTaksitSayisi() {
        return taksitSayisi;
    }

    public void setTaksitSayisi(int taksitSayisi) {
        this.taksitSayisi = taksitSayisi;
    }
}
