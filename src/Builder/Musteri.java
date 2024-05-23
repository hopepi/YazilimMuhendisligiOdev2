package Builder;

public class Musteri {
    private final String ad;
    private final String soyad;
    private final String tcno;
    private final String telno;
    private final String adres;

    private Musteri(Builder builder) {
        this.ad = builder.ad;
        this.soyad = builder.soyad;
        this.tcno = builder.tcno;
        this.telno = builder.telno;
        this.adres = builder.adres;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTcno() {
        return tcno;
    }

    public String getTelno() {
        return telno;
    }
    public String getAdres() {
        return adres;
    }

    public static class Builder {
        private String ad;
        private String soyad;
        private String tcno;
        private String telno;
        private String adres;

        public Builder(String ad, String soyad, String tcno, String telno) {
            this.ad = ad;
            this.soyad = soyad;
            this.tcno = tcno;
            this.telno = telno;
        }

        public Builder ad(String ad) {
            this.ad = ad;
            return this;
        }

        public Builder soyad(String soyad) {
            this.soyad = soyad;
            return this;
        }

        public Builder tcno(String tcno) {
            this.tcno = tcno;
            return this;
        }

        public Builder telno(String telno) {
            this.telno = telno;
            return this;
        }

        public Builder adres(String adres) {
            this.adres = adres;
            return this;
        }

        public Musteri build() {
            return new Musteri(this);
        }
    }
}
