package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class Rekruter {
    private List<Rekrutacja> rekrutacjas = new ArrayList<>();

    public void removeRekrutacja(Rekrutacja rekrutacja) {
        rekrutacjas.remove(rekrutacja);
    }

    public void addRekrutacja(Rekrutacja rekrutacja) {
        if (!rekrutacjas.contains(rekrutacja)) {
            rekrutacjas.add(rekrutacja);
            rekrutacja.setRekruter(this);
        }
    }
}
