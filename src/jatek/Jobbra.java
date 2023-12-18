package jatek;

public class Jobbra extends Helyszin {

    public Jobbra() {
    }

    @Override
    public String leiras() {
        return "Ez a jobb irány";
    }

    @Override
    public String egyikBtnFelirat() {
        return "...";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

}
