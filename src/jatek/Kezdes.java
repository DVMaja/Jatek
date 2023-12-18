package jatek;

public class Kezdes extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez a Kezdés. Jobbra vagy Balra?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "Jobbra";
    }

    @Override
    public String masikBtnFelirat() {
        return "Balra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

}
