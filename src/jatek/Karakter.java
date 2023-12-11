package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles; //String lista
    Random rnd;

    public Karakter() {
        //r.nextInt(high-low) + low;
        this.eletero = ((rnd.nextInt(1, 7) + 6) * 2) + 12;
        this.ugyesseg = (rnd.nextInt(1, 7) + 6) + 6;
        this.szerencse = (rnd.nextInt(1, 7) + 6) + 6;
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

}
