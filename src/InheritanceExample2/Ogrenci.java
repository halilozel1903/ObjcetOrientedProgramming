package InheritanceExample2;

public class Ogrenci extends Personel{

    private int ogrNo;

    public Ogrenci() {

        setIsim("Henüz girilmedi.");
        setSoyisim("Henüz girilmedi.");
        setYas(0);
        ogrNo = 0;
    }


    public Ogrenci(String isim, String soyisim, int yas, int ogrNo) {
        setIsim(isim);
        setSoyisim(soyisim);
        setYas(yas);
        this.ogrNo = ogrNo;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    @Override
    public String getKimlikBilgileri() { // değerleri getir. Üst sınıftaki metodu ezdik.

        return "Kimlik bilgileri : İsmi : "+getIsim()+" Soyisim : "+getSoyisim()+" Yaş :"+getYas()+" Ogrenci no : "+ogrNo;

    }

    @Override
    public String toString() { // üst sınıftaki değeri al ve noyu ekle ve kullan.
        return super.toString() + "Ogrenci No : "+ogrNo;
    }
}
