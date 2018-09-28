package nesneSınıfKavrami;

public class Main {

    public static void main(String[] args) {


        Araba sahin = new Araba(); // Araba sınıfından sahin nesnesi üretildi.
        sahin.setYil(2019); // yil bilgisi atandı.

        System.out.println("Şahinin yılı : "+sahin.getYil()); // yıl değeri yazdırıldı.

        Araba kartal = new Araba();
        kartal.setYil(2050);

        System.out.println("Kartalın yılı :"+kartal.getYil());

        sahin = kartal; // kartalın sahip olduğu değerleri sahine verdi.

        System.out.println("Şahinin yılı :"+sahin.getYil());


    }
}
