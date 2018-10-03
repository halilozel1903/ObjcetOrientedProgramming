package Inheritance;

public class Kare extends GeometrikSekil{


    @Override
    public String toString() {

       // return super.toString(); // Üst sınıftaki değeri döndür.

        return "Karenin bir kenarı :"+this.getBoy(); // override edip yeni değeri döndür.
    }
}
