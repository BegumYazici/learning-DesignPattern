package designPattern.GeneralHierarchy;

import java.util.ArrayList;

public class GeneralHierarchy {
    public static void main(String[] args) {

        Yonetici ali = new Yonetici("Ali");
        Calisan veli = new Calisan("Veli");
        Calisan ahmet = new Calisan("Ahmet");

        ali.ekleCalisan(ahmet);
        ali.ekleCalisan(veli);
        System.out.println("Ahmet'in yöneticisi: "+ahmet.yonetici.isim);
        System.out.println("Ali'nin calisanlari: 1--> "+ali.altlari.get(0).isim + " 2--> " + ali.altlari.get(1).isim);
        System.out.println("Veli'in yöneticisi: "+veli.yonetici.isim);
        System.out.println("Ali'nin kaç tane calisani var? --> "+ ali.altlari.size());
    }
}

class Calisan{

    String isim;
    Calisan yonetici;

    public Calisan() {
    }

    public Calisan(String isim) {
        this.isim = isim;
    }
}

class Yonetici extends Calisan{

    ArrayList<Calisan> altlari = new ArrayList<>();

    public Yonetici(String isim){
        super(isim);
    }

    public void ekleCalisan(Calisan alt){
        altlari.add(alt);
        alt.yonetici = this;
    }
}
