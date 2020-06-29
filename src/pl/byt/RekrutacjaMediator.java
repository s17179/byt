package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class RekrutacjaMediator {
    private List<Aplikacja> aplikacjas = new ArrayList<>();

    private List<Ocena> ocenas = new ArrayList<>();

    private List<EtapRekrutacji> etapRekrutacjis = new ArrayList<>();

    public RekrutacjaMediator(Aplikacja initialAplikacja, EtapRekrutacji initialEtapRekrutacji) {
        addAplikacja(initialAplikacja);
        addEtapRekrutacji(initialEtapRekrutacji);
    }

    public void addAplikacja(Aplikacja aplikacja) {
        if (!aplikacjas.contains(aplikacja)) {
            aplikacjas.add(aplikacja);
            aplikacja.setRekrutacjaMediator(this);
        }
    }

    public void removeAplikacja(Aplikacja aplikacja) {
        aplikacjas.remove(aplikacja);
    }

    public void addOcena(Ocena ocena) {
        if (!ocenas.contains(ocena)) {
            ocenas.add(ocena);
            ocena.setRekrutacjaMediator(this);
        }
    }

    public void removeOcena(Ocena ocena) {
        ocenas.remove(ocena);
    }

    public void addEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        if (!etapRekrutacjis.contains(etapRekrutacji)) {
            etapRekrutacjis.add(etapRekrutacji);
            etapRekrutacji.setRekrutacjaMediator(this);
        }
    }

    public void removeEtapRekrutacji(EtapRekrutacji etapRekrutacji) {
        etapRekrutacjis.remove(etapRekrutacji);
    }

    public void akceptujKandydata() {

    }

    public void aplikuj() {

    }

    public void ocenKandydata() {

    }

    public void odrzucKandydata() {

    }

    public void podjedzDoTestu() {

    }

    public void przypiszKandydataDoNastepnegoEtapu() {

    }

    public void przypiszRekruteraSpecjaliste() {

    }

    public static void utworzRekrutacje() {

    }
}
