package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class Rekruter extends PracownikHR {
    private List<Rekrutacja> rekrutacjaList = new ArrayList<>();

    public void removeRekrutacja(Rekrutacja rekrutacja) {
        rekrutacjaList.remove(rekrutacja);
    }

    public void addRekrutacja(Rekrutacja rekrutacja) {
        if (!rekrutacjaList.contains(rekrutacja)) {
            rekrutacjaList.add(rekrutacja);
            rekrutacja.setRekruter(this);
        }
    }

    public List<Rekrutacja> getRekrutacjaList() {
        return rekrutacjaList;
    }
}
