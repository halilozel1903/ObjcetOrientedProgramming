package Extensibility;

/*
    Extebsibility : Önceden oluşturulmuş herhangi bir uygulama yapısını kalıtım - çok biçimlilik kullanarak
    genişletmektir diyebiliriz. Bu yolla sürekli tekrar etmemiz gereken işlemlerden kurtulabilmekteyiz.
    Şayet şekiller örneğimizdeki şekillerin sayısını ve ona bağlı alt sınıflar tam olarak net değilse
    genişletilebilirlik tam da aradığımız yöntem olacaktır.

 */

public class Main {

    public static void main(String[] args) {


        GeometrikSekil gs1 = new GeometrikSekil();
        Kare k1 = new Kare(4);
        Dikdortgen d1 = new Dikdortgen(5,6);


        GeometrikSekil gs2 = new GeometrikSekil();
        Kare k2 = new Kare(7);
        Dikdortgen d2 = new Dikdortgen(9,8);


        // Daire hesaplaması
        Daire dd1 = new Daire(4);
        Daire dd2 = new Daire(7);

        // array tanımı dizinin boyutu verildi.
        GeometrikSekil[] sekillerDizisi = new GeometrikSekil[8];
        sekillerDizisi[0] = gs1;
        sekillerDizisi[1] = k1;
        sekillerDizisi[2] = d1;
        sekillerDizisi[3] = gs2;
        sekillerDizisi[4] = k2;
        sekillerDizisi[5] = d2;
        sekillerDizisi[6] = dd1;
        sekillerDizisi[7] = dd2;



        // metodu çağırdık.
        sekilAlanHesapla(sekillerDizisi);

    }


    // dizi alan bir metod
    public static void sekilAlanHesapla(GeometrikSekil[] sekiller){

        for (GeometrikSekil geciciNesne : sekiller){

            // alanı hesapla ve yazdır.
            System.out.println("Şeklin alanı : "+geciciNesne.alanHesapla());
        }
    }

}
