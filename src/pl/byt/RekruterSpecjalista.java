package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class RekruterSpecjalista extends PracownikHR {
    private String specjalizacja;

    private List<EtapRekrutacji> etapRekrutacjiList = new ArrayList<>();

    public RekruterSpecjalista(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public void addEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        if (!etapRekrutacjiList.contains(etapRekrutacji)) {
            etapRekrutacjiList.add(etapRekrutacji);
            etapRekrutacji.setRekruterSpecjalista(this);
        }
    }

    public void removeEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        etapRekrutacjiList.remove(etapRekrutacji);
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public List<EtapRekrutacji> getEtapRekrutacjiList() {
        return etapRekrutacjiList;
    }
}
