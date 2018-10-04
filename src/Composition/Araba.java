package Composition;

public class Araba {

    // kullanılmak istenen Sınıfdan nesne üretiyoruz.
    private Motor motor = new Motor();

    // hareket zamani metodu
    public void hareketZamani(){

        motor.calistir(); // metodu çağır
        System.out.println("Araba harekete geçer."); // mesaj göster.

    }

    // durma zamani metodu
    public void durmaZamani(){

        motor.durdur(); // metodu çağır.
        System.out.println("Araba durur."); // mesaj göster.

    }

}
