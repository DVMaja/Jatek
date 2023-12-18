package jatek;

public class Kezdes extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a Kezdés.";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikBtnFelirat() {
        return "Balra";
    }

}
