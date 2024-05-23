package Factory;

import Brigde.Car;

import java.util.Date;
import java.util.Scanner;

public class RezervasyonFactory {

    private Rezervasyon rezervasyon = new Rezervasyon();
    private Scanner scanner = new Scanner(System.in);
    private int removeItem =0;
    private Date date= new Date();
    public void rezervasyonYap(){
        int i=1;
        System.out.println("Araç Seçimini Yapınız :");
        for (Car veri : rezervasyon.getAracVerileri().getVeriListesi()){
            System.out.print(i+") ");
            veri.detaylariGoster();
            i++;
        }
        System.out.println("Rezervasyon yapmak istediğiniz araç numarasını giriniz :");
        removeItem=scanner.nextInt();
        rezervasyon.getAracVerileri().aracSil(removeItem--);
        rezervasyon.setRezervasyonTarihi(date);
        System.out.println("Tarihinde Araç kiralanmıştır : "+rezervasyon.getRezervasyonTarihi());


    }
}
