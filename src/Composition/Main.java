package Composition;

/*

 Kompozisyon : Yeni sınıf özelliğini kullanmak istediği sınıfın referansını içinde tutuyor
 ve gerektiğinde o sınıfın metodlarını çağırarak diğer sınıfın özelliklerini ve metotlarını
 kullanabilir.

 */

public class Main {

    public static void main(String[] args) {

        Araba araba = new Araba(); // nesne tanımı
        araba.hareketZamani(); // metot çağırımı
        araba.durmaZamani(); // metot çağırımı

    }
}
