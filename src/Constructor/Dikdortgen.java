package Constructor;

public class Dikdortgen {

    private double en; // en tanımı
    private double boy; // boy tanımı


    public Dikdortgen(){ // default - parametresiz constructor

        en = 11; // default olarak bu değer atandı.
    }

    public Dikdortgen(double en, double boy) { // parametreli constructor
        this.en = en;
        this.boy = boy;
    }

    public Dikdortgen(double boy) { // boy değerini alan constructor
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double alan(){

        return en*boy;
    }


}
