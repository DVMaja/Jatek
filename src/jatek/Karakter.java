package jatek;

import java.util.ArrayList;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles; //String lista

    public void felvesz(Targy targy) {
        felszereles.add(targy);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

}
