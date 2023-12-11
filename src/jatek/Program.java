package jatek;

public class Program {

    public static void main(String[] args) {
        new Program().feladat();
    }

    private void feladat() {
        Karakter k1 = new Karakter();
        Targy t1 = new Targy("alma", "alma ehető");
        Targy t2 = new Targy("körte", "körte ehető");
        Targy t3 = new Targy("kard", "stabi stabi");

        k1.felvesz(t1);
        k1.felvesz(t2);
        k1.felvesz(t3, 3);
        
        k1.hasznal("alma");
    }

}
