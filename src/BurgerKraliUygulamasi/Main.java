package BurgerKraliUygulamasi;

public class Main {

    public static void main(String[] args) {

        Hamburger h1 = new Hamburger("Sade","Beyaz Ekmek","Kırmızı Et",9.90);
        h1.ekleIlaveUrun1("Patates Kızartması",3.00);
        h1.ekleIlaveUrun2("Kola",3.90);
        h1.ekleIlaveUrun3("Sos",1.00);
        h1.ekleIlaveUrun4("Soğan",0.50);
        System.out.println("Toplam Tutar : "+h1.hamburgerBilgileri());


        System.out.println("-------------------------------------");

        SagliklaBurger sg=new SagliklaBurger("Beyaz",5.50);
        sg.ekleIlaveUrun1("Patates Kızartması",3.00);
        sg.ekleIlaveUrun2("Kola",3.90);
        sg.ekleIlaveUrun3("Sos",1.00);
        sg.ekleIlaveUrun4("Soğan",0.50);
        sg.ekleSaglikliUrun1("Ton Balığı",2.00);
        sg.ekleSaglikliUrun2("Domates",3.00);
        System.out.println("Toplam Tutar : "+sg.hamburgerBilgileri());

    }

}
