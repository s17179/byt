package pl.byt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RekrutacjaMediator {
    private List<Aplikacja> aplikacjaList = new ArrayList<>();

    private List<Ocena> ocenaList = new ArrayList<>();

    private List<EtapRekrutacji> etapRekrutacjiList = new ArrayList<>();
    public static Set<EtapRekrutacji> allEtapRekrutacjiSet = new HashSet<>();

    private Rekrutacja rekrutacja;
    public static Set<Rekrutacja> allRekrutacjaList = new HashSet<>();

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
        if (!aplikacjaList.contains(aplikacja)) {
            aplikacjaList.add(aplikacja);
            aplikacja.setRekrutacjaMediator(this);
        }
    }

    public void removeAplikacja(Aplikacja aplikacja) {
        aplikacjaList.remove(aplikacja);
    }

    public void addOcena(Ocena ocena) {
        if (!ocenaList.contains(ocena)) {
            ocenaList.add(ocena);
            ocena.setRekrutacjaMediator(this);
        }
    }

    public void removeOcena(Ocena ocena) {
        ocenaList.remove(ocena);
    }

    public void addEtapRekrutacji(EtapRekrutacji etapRekrutacji) throws Exception {
        if (!etapRekrutacjiList.contains(etapRekrutacji)) {
            if (allEtapRekrutacjiSet.contains(etapRekrutacji)) {
                throw new Exception("Given etapRekrutacji is already connected with a RekrutacjaMediator");
            }

            etapRekrutacjiList.add(etapRekrutacji);
            allEtapRekrutacjiSet.add(etapRekrutacji);
        }
    }

    public void setRekrutacja(Rekrutacja rekrutacja) throws Exception {
        if (allRekrutacjaList.contains(rekrutacja)) {
            throw new Exception("Given rekrutacja is already connected with a RekrutacjaMediator");
        }

        if (this.rekrutacja != null) {
            allRekrutacjaList.remove(this.rekrutacja);
        }

        this.rekrutacja = rekrutacja;
        allRekrutacjaList.add(rekrutacja);
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

    public List<Aplikacja> getAplikacjaList() {
        return aplikacjaList;
    }

    public List<Ocena> getOcenaList() {
        return ocenaList;
    }

    public List<EtapRekrutacji> getEtapRekrutacjiList() {
        return etapRekrutacjiList;
    }

    public Rekrutacja getRekrutacja() {
        return rekrutacja;
    }
}
