package Polymorphism;

public class Main {

    public static void main(String[] args) {


        GeometrikSekil gs1 = new GeometrikSekil();// nesne tanımı
        Kare k1 = new Kare(8);
        Dikdortgen d1 = new Dikdortgen(4,6);
        sekilAlanlari(gs1);
        sekilAlanlari(k1);
        sekilAlanlari(d1);


    }

    // çok biçimlilik : çalışma anında karar veriliyor.
    public static void sekilAlanlari(GeometrikSekil sekil){

        System.out.println("Alan hesabı : "+sekil.alanHesapla());

    }
}
