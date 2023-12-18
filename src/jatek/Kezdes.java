package jatek;

public class Kezdes extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a Kezdés. Jobbra vagy Balra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtnFelirat() {
        return "Balra";
    }

}
