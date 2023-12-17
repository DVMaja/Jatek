package jatek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek {

    public void run() {
        Karakter k1 = new Karakter();
        Targy t1 = new Targy("alma", "alma ehető");
        Targy t2 = new Targy("körte", "körte ehető");
        Targy t3 = new Targy("kard", "stabi stabi");

        k1.felvesz(t1);
        k1.felvesz(t2);
        k1.felvesz(t3, 3);

        System.out.println("k1: " + k1.toString());
        //System.out.println(k1.getFelszereles());

        k1.hasznal("kard", 1, true);
        System.out.println("k1: " + k1.toString());

        //mentes(k1);
        //k1 = null;
        //System.out.println("k1: " + k1.toString());
    }

    private void mentes(Karakter k1) {
        System.out.println("Mentés");
        try {
            ObjectOutputStream objKi = new ObjectOutputStream((new FileOutputStream(("karakter_k1.bin"))));
            objKi.writeObject(k1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("mentve");

    }

    private void belvasas() {

    }
}
