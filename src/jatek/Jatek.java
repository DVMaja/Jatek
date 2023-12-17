package jatek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek {

    public void run() {
        Karakter k1 = new Karakter();
        Targy t1 = new Targy("alma", "alma ehető");
        Targy t2 = new Targy("körte", "körte ehető");
        Targy t3 = new Targy("kard", "stabi stabi");
        Targy t4 = new Targy("arany", "arany érme, vásárlásra alkalmas");

        k1.felvesz(t1);
        k1.felvesz(t2);
        k1.felvesz(t3, 3);
        k1.felvesz(t4, 8);

        System.out.println("k1: " + k1.toString());

        k1.hasznal("kard", 4, true);
        System.out.println("k1: " + k1.toString());

        mentes(k1);
        k1 = null;
        k1 = belvasas(k1);
        System.out.println("k1: " + k1.toString());
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

    private Karakter belvasas(Karakter k1) {
        System.out.println("Adatok Beolvasása elkezdődött.");
        try (ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("karakter_k1.bin"))) {
            k1 = (Karakter) objBe.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Adatok beolvasása befejezve");
        return k1;
    }
}
