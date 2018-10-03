package InheritanceExample3;

public class Main {

    public static void main(String[] args) {


        Personel p1 = new Personel("Mehmet","Gezer",55);
        System.out.println(p1.getKimlikBilgileri());

        Ogrenci ogr1 = new Ogrenci("Ayşe","Hayriye",16,8976);
        System.out.println(ogr1.getKimlikBilgileri());

    }
}
