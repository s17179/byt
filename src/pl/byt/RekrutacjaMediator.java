package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class RekrutacjaMediator {
    private List<Aplikacja> aplikacjas = new ArrayList<>();

    private List<Ocena> ocenas = new ArrayList<>();

    private List<EtapRekrutacji> etapRekrutacjis = new ArrayList<>();

    private Rekrutacja rekrutacja;

    public RekrutacjaMediator(
            Aplikacja initialAplikacja,
            EtapRekrutacji initialEtapRekrutacji,
            Rekrutacja rekrutacja
    ) {
        addAplikacja(initialAplikacja);
        addEtapRekrutacji(initialEtapRekrutacji);
        setRekrutacja(rekrutacja);
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

    public void setRekrutacja(Rekrutacja rekrutacja) {
        if (this.rekrutacja != null && this.rekrutacja != rekrutacja) {
            rekrutacja.removeRekrutacjaMediator(this);
        }

        this.rekrutacja = rekrutacja;
        rekrutacja.setRekrutacjaMediator(this);
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
