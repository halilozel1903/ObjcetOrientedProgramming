package InheritanceExample2;

public class Personel {

   // Override : bir üst sınıftaki metotları kullanıp değiştirmek(ezmek) anlamına gelir.

    private String isim;
    private String soyisim;
    private int yas;


    // nesne olusturulunca default olusacak değerler
    public Personel(){

        isim = "Henüz girilmedi" ;
        soyisim = "Henüz girilmedi" ;
        yas = 0 ;

    }

    // değerler verilince calışacak olan method
    public Personel(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

        if (yas<0){ // yas değeri 0 dan kucukse
            this.yas = 0; // yasa 0 atandı.
        }else{ // farklı ise
            this.yas = yas; // yas bilgisi atandı.
        }

    }

    // personel bilgilerini veren bir metod tanımlandı.
    public String getKimlikBilgileri(){

        return "Kimlik bilgileri : İsmi : "+isim+" Soyisim : "+soyisim+" Yaş :"+yas;
    }


    @Override
    public String toString() {
        return "Kimlik bilgileri To String : İsmi : "+isim+" Soyisim : "+soyisim+" Yaş :"+yas;
    }
}
