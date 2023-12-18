package jatek;

public class Balra extends Helyszin {

    @Override
    public String leiras() {
        return "Ez balra van";
    }

    @Override
    public String egyikBtnFelirat() {
        return "Északra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Start();
    }

}
