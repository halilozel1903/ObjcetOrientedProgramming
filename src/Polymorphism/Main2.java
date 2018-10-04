package Polymorphism;

public class Main2 {

    public static void main(String[] args) {

        GeometrikSekil g1 = new GeometrikSekil();
        Kare k1 = new Kare(5);
        Dikdortgen d1 = new Dikdortgen(11,8);

        sekilAlanlariHesapla(g1);
        sekilAlanlariHesapla(k1);
        sekilAlanlariHesapla(d1);


    }

    private static void sekilAlanlariHesapla(Object gelenNesne) {


        if (gelenNesne instanceof GeometrikSekil){
            GeometrikSekil g = (GeometrikSekil) gelenNesne;
            System.out.println("Şekil alanı : "+g.alanHesapla());
        }else if (gelenNesne instanceof Kare){
            Kare k = (Kare) gelenNesne;
            System.out.println("Kare alanı : "+k.alanHesapla());
        }else{
            Dikdortgen d = (Dikdortgen) gelenNesne;
            System.out.println("Dikdörtgen alanı : "+d.alanHesapla());
        }



    }
}
