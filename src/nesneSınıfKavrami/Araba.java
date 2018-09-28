package nesneSınıfKavrami;

public class Araba {

    private int yil;
    private String renk;
    private String adi;
    private int beygirGucu;
    private boolean otomatikVitesMi;


    public void setYil(int yil){ // veriye okunan metod

        if (yil <= 2017 || yil > 1900){ // eğer yıl değeri 1990'dan büyük 2017'den küçükse yıl değerini goster
            this.yil = yil;
        }else System.out.println("Yanlış değer !!!"); // aksi durumda ise default olarak 0 atanır.


    }

    public int getYil(){ // veriyi getiren metod

        return this.yil;
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public boolean isOtomatikVitesMi() {
        return otomatikVitesMi;
    }

    public void setOtomatikVitesMi(boolean otomatikVitesMi) {
        this.otomatikVitesMi = otomatikVitesMi;
    }
}
