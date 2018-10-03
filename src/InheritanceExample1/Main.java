package InheritanceExample1;

public class Main {

    public static void main(String[] args) {


        Personel halil = new Personel("Halil","Özel",21); //nesne tanımı ve değer atımı
        System.out.println(halil.getKimlikBilgileri());
        System.out.println(halil.toString());


        Ogrenci yusuf = new Ogrenci(); // ogrenci tanımı
        System.out.println(yusuf.getKimlikBilgileri()); // değer atanmamış halindeki değerleri


        Ogrenci emre = new Ogrenci("Emre","Özel",12,2177);
        System.out.println(emre.getKimlikBilgileri());
        System.out.println(emre.toString()); // to String metodu çıktısı
    }
}
