package jatek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Karakter implements Serializable {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles; //String lista
    private Random rnd = new Random();

    public Karakter() {
        this.eletero = dobas() + dobas() + 12;
        this.ugyesseg = dobas() + 6;
        this.szerencse = dobas() + 6;
        felszereles = new ArrayList<>();

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

    public ArrayList<Targy> getFelszereles() {//törlendő
        return felszereles;
    }

    public void hasznal(String nev) {
        hasznal(nev, eletero, true);

    }

    public void hasznal(String nev, int db) {
        hasznal(nev, db, true);

    }

    public void hasznal(String nev, int db, boolean levon) {
        int dbSzam = 0;
        ArrayList<Integer> torlendoIndexek = new ArrayList<>();
        //kigyüjtöm az indexeket, és késöbb megmondom hogy hol töröljön
        //bejárás közben nem lehet removolni, 
        //külön methodusba kirakjuk a találtakat, és majd ezt adjuk vissza

        for (int i = 0; i < felszereles.size(); i++) {
            Targy f = felszereles.get(i);

            if (nev.equals(f.getNev())) {
                dbSzam++;

                if (dbSzam <= db && levon) {
                    torlendoIndexek.add(i);
                }
            }
        }

        if (!torlendoIndexek.isEmpty()) {
            for (int i : torlendoIndexek) {
                felszereles.remove(i);
            }
        }
    }

//    private void talaltTargyak() {
//    }
//
//    private boolean van() {
//        return true;
//    }
    private String felszFormazas() { // esetleg kiírni hogy  mennyi db ahelyett hogy mindent kiírunk
        String formazott = "\nFelszerelés: \n";
        for (Targy f : felszereles) {
            formazott += "\tNeve: " + f.getNev() + "\t Leírás: " + f.getLeiras() + "\n";
        }
        return formazott;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + felszFormazas() + '}';
    }

}
