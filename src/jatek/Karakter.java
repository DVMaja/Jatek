package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles; //String lista
    private Random rnd = new Random();

    public Karakter() {
        //r.nextInt(high-low) + 1;
        this.eletero = dobas() + dobas() + 12;
        this.ugyesseg = dobas() + 6;
        this.szerencse = dobas() + 6;
        felszereles = new ArrayList<>();
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

    private int dobas() { //also, felso
        return rnd.nextInt(1, 6) + 1;
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }
    

}
