package BurgerKraliUygulamasi;

public class BabaHamburger extends Hamburger {


    public BabaHamburger() {
        super("Baba Burger", "Beyaz", "Kırmızı", 15.00);
        super.ekleIlaveUrun1("Patates Kızartması",2.00);
        super.ekleIlaveUrun2("Kola",3.75);
    }

    @Override
    public void ekleIlaveUrun1(String ad, Double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");

    }

    @Override
    public void ekleIlaveUrun2(String ad, Double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleIlaveUrun3(String ad, Double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleIlaveUrun4(String ad, Double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }
}
