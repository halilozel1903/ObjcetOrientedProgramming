package InheritanceExample3;

public class Ogrenci extends Personel{

    private int ogrNo;

    public Ogrenci() {

        super(); // Personel sınıfının yapıcısını kullan
        ogrNo = 0;

    }


    public Ogrenci(String isim, String soyisim, int yas, int ogrNo) {
        super(isim, soyisim, yas); // Personel sınıfının yapıcısını kullandık.
        this.ogrNo = ogrNo;
       // setOgrNo(ogrNo); buda ikinci bir tanımlama-değer atama
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {

        if (ogrNo<0){
            this.ogrNo = 0;
        }else{
            this.ogrNo = ogrNo;
        }

    }


    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri()+"Ogrenci No : "+ogrNo;
    }
}
