package Constructor;

public class Main {

public static void main(String[] args){

    Dikdortgen d1 = new Dikdortgen(); // nesne
    d1.setEn(5); // en değeri
    d1.setBoy(10); // boy değeri

    System.out.println("Dikdortgen 1 alan :"+d1.alan()); // alan hesabı


    Dikdortgen d2 = new Dikdortgen(); // nesne
    d2.setEn(15);
    d2.setBoy(20);

    System.out.println("Dikdortgen 2 alan :"+d2.alan());


    Dikdortgen d3 = new Dikdortgen();
    d3.setBoy(30); // boy değeri verdik.

    System.out.println("Dikdortgen 3 alan :"+d3.alan()); // alan hesabında en değeri verilmedi.Default olarak alındı.

    Dikdortgen d4 = new Dikdortgen(6,12); // constructor yardımıyla alan değerleri
    System.out.println("Dikdortgen 4 alan :"+d4.alan()); // hesabı

    Dikdortgen d5 = new Dikdortgen(9); // boy değeri
    d5.setEn(7); // en değeri
    System.out.println("Dikdortgen 5 alan :"+d5.alan()); // hesabı




}


}


