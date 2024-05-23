package Factory;

import Singleton.AracVerileri;

import java.util.Date;

public class Rezervasyon {
    private Date rezervasyonTarihi;
    private AracVerileri aracVerileri = new AracVerileri();

    public AracVerileri getAracVerileri() {
        return aracVerileri;
    }

    public void setAracVerileri(AracVerileri aracVerileri) {
        this.aracVerileri = aracVerileri;
    }

    public Date getRezervasyonTarihi() {
        return rezervasyonTarihi;
    }

    public void setRezervasyonTarihi(Date rezervasyonTarihi) {
        this.rezervasyonTarihi = rezervasyonTarihi;
    }
}
