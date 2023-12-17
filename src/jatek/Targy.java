package jatek;

import java.io.Serializable;
import java.util.UUID;

public class Targy implements Serializable {

    private String nev, leiras;
    private UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        id = UUID.randomUUID();
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getId() {
        return id;
    }

}
