package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles; //String lista
    private Random rnd = new Random();

    public Karakter() {
        this.eletero = dobas() + dobas() + 12;
        this.ugyesseg = dobas() + 6;
        this.szerencse = dobas() + 6;

    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);
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

    public void hasznal(String nev) {
        for (Targy f : felszereles) {
            if (nev.equals(f.getNev())) {
                felszereles.remove(f);
            }
        }
    }

    public void hasznal(String nev, int db) {
        hasznal(nev);
    }

    public void hasznal(String nev, int db, boolean eleg) {
        hasznal(nev, db);
    }

}
