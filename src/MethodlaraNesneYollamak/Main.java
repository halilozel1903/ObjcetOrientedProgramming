package MethodlaraNesneYollamak;

public class Main {

    public static void main(String[] args){

        int a = 12;
        int b = 24;
        int toplam = topla(a,b);
        System.out.println("Toplam değeri :"+toplam); // toplam metodu
        System.out.println("a değişkeni :"+aDegiskeniniYazdir(a)); // metoda gönderilen değişken
        System.out.println("a değeri : "+a); // a değeri


        Dikdortgen dikdortgen1 = new Dikdortgen(45,90);
        System.out.println("Method öncesi en : "+dikdortgen1.getEn()+" boy :"+dikdortgen1.getBoy()); // ilk değerleri
        yeniDikdortgenDegerleri(dikdortgen1); // referans noktası
        System.out.println("Method sonrası en : "+dikdortgen1.getEn()+" boy :"+dikdortgen1.getBoy()); // son değerleri
    }

    // yeni değerler - metod içerisinde nesne değişkenleri değiştiriliyor.
    private static void yeniDikdortgenDegerleri(Dikdortgen dikdortgen1) {

        dikdortgen1.setEn(70);
        dikdortgen1.setBoy(80);
    }

    // a değişkeni metodu
    private static int aDegiskeniniYazdir(int a) {

        return a+8;
    }

    // toplama metodu
    private static int topla(int a, int b) {

        return (a+8) + (b+6);
    }

}
