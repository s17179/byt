package pl.byt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RekrutacjaMediator {
    private List<Aplikacja> aplikacjas = new ArrayList<>();

    private List<Ocena> ocenas = new ArrayList<>();

    private List<EtapRekrutacji> etapRekrutacjis = new ArrayList<>();
    private static Set<EtapRekrutacji> allEtapRekrutacjis = new HashSet<>();

    private Rekrutacja rekrutacja;

    public RekrutacjaMediator(
            Aplikacja initialAplikacja,
            EtapRekrutacji initialEtapRekrutacji,
            Rekrutacja rekrutacja
    ) throws Exception {
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

    public void addEtapRekrutacji(EtapRekrutacji etapRekrutacji) throws Exception {
        if (!etapRekrutacjis.contains(etapRekrutacji)) {
            if (allEtapRekrutacjis.contains(etapRekrutacji)) {
                throw new Exception("Given etapRekrutacji is already connected with a RekrutacjaMediator");
            }

            etapRekrutacjis.add(etapRekrutacji);
            allEtapRekrutacjis.add(etapRekrutacji);
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
