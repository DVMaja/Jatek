package jatek;

public class Jatek {

    private void mentes() {
    }

    private void belvasas() {
    }

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

        k1.hasznal("kard", 2, true);
        System.out.println("k1: " + k1.toString());
        //Mentsd el a jelenlegi játék állást
    }
}
