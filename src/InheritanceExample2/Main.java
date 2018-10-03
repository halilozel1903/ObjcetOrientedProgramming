package InheritanceExample2;

public class Main {

    public static void main(String[] args) {


        Personel ali = new Personel("Ali","Veli",22);
        System.out.println(ali.getKimlikBilgileri());

        Ogrenci veli = new Ogrenci("Veli","Ali",20,1234);
        System.out.println(veli.getKimlikBilgileri());

        System.out.println(ali.toString());
        System.out.println(veli.toString());

    }
}
