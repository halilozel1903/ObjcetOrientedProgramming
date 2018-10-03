package InheritanceExample1;

public class Ogrenci {

    private String isim;
    private String soyisim;
    private int yas;
    private int ogrNo;

    public Ogrenci() {
        isim = "Henüz girilmedi";
        soyisim = "Henüz girilmedi";
        yas = 0;
        ogrNo = 0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.ogrNo = ogrNo;
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

        if (yas<0){
            this.yas = 0;
        }else{
            this.yas = yas;
        }

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

    public String getKimlikBilgileri(){

        return "Kimlik bilgileri : İsmi : "+isim+" Soyisim : "+soyisim+" Yaş :"+yas+"Ogrenci no :"+ogrNo;
    }


    @Override
    public String toString() {
        return "Kimlik bilgileri To String : İsmi : "+isim+" Soyisim : "+soyisim+" Yaş :"+yas+"Ogrenci no :"+ogrNo;
    }
}
