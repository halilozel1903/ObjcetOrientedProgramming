package StaticVeFinal;

public class Main {

    public static void main(String[] args){

        System.out.println("Olusturulan cemberdaire nesne sayısı :"+CemberDaire.getOlusturulanNesneSayisi()); // 0
        CemberDaire d1 = new CemberDaire(); // nesne olusturma
        System.out.println("Olusturulan cemberdaire nesne sayısı :"+CemberDaire.getOlusturulanNesneSayisi()); // 1


        CemberDaire d2 = new CemberDaire(); // yeni nesne

        System.out.println("Nesne üzerinden tüm sayı : "+d2.getOlusturulanNesneSayisi()); // 2

        CemberDaire d3 = new CemberDaire();
        System.out.println("Olusturulan cemberdaire nesne sayısı :"+CemberDaire.getOlusturulanNesneSayisi()); // 3

        CemberDaire d4 = new CemberDaire();
        d4.setYaricap(10);
        System.out.println("cevre : "+d4.cevreHesapla()); // cevre hesabı
        System.out.println("alan : "+d4.alanHesapla()); // alan hesabı


    }
}
