package jatek;

import java.util.UUID;

public class Targy {

    private String nev, leiras;
    private UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        id = UUID.randomUUID();
    }

}
