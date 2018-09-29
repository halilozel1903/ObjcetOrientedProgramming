package StaticVeFinal;

// Static : Sınıftaki alanlara nesne oluşturmadan erişmeyi sağlar. Tüm nesneler bu alanı görebilir.
// Final : Sabit değerlerdir. Değiştirilemez.

public class CemberDaire {

    private double yaricap;
    private static int olusturulanNesneSayisi; // set etmeden Class tarafından erisilir.
    private final double PI = 3.14;


    public CemberDaire(){ // parametresiz constructor
        System.out.println("CemberDaire nesnesi olusturuluyor.");
        olusturulanNesneSayisi++;
    }


    public static int getOlusturulanNesneSayisi() { // her yerden erisilen metod
        return olusturulanNesneSayisi;
    }

    public void setYaricap(double yaricap){ // yarıcap set edilmesi

        if (yaricap>=1){ // yarıcap değeri 1'e eşit ya da 1'den büyükse
          this.yaricap = yaricap;
        }else{ // değilse
           this.yaricap=1; // 1 değerine eşitle
        }
    }

    public double getYaricap() { // yarıcap değerinin getirilmesi

        return this.yaricap;
    }

    public double cevreHesapla(){ // cevreyi hesapla metodu

        return 2*PI*yaricap;
    }

    public double alanHesapla(){ // alanı hesapla metodı
        return PI*yaricap*yaricap;
    }
}
