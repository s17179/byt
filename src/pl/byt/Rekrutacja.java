package pl.byt;

import java.util.*;

public class Rekrutacja {
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private String opis;
    private String stanowisko;
    private List<String> wymagania = new ArrayList<>();

    private RekrutacjaMediator rekrutacjaMediator;

    private Rekruter rekruter;

    private TestKompetencji testKompetencji;
    public static Set<TestKompetencji> allTestKompetencjis = new HashSet<>();

    private Rekrutacja(
            RekrutacjaMediator rekrutacjaMediator,
            String initialWymaganie,
            Rekruter rekruter
    ) {
        this.rekrutacjaMediator = rekrutacjaMediator;
        this.rekruter = rekruter;
        wymagania.add(initialWymaganie);
    }

    public static Rekrutacja createRekrutacja(
            RekrutacjaMediator rekrutacjaMediator,
            String initialWymagania,
            Rekruter rekruter
    ) throws Exception {
        if (rekrutacjaMediator == null) {
            throw new Exception("Given rekrutacjaMediator cannot be null");
        }

        Rekrutacja rekrutacja = new Rekrutacja(rekrutacjaMediator, initialWymagania, rekruter);

        rekrutacjaMediator.setRekrutacja(rekrutacja);

        return rekrutacja;
    }

    public void setRekruter(Rekruter rekruter) {
        if (this.rekruter == rekruter) {
            return;
        }

        if (this.rekruter != null) {
            rekruter.removeRekrutacja(this);
        }

        this.rekruter = rekruter;
        rekruter.addRekrutacja(this);
    }

    public void setTestKompetencji(TestKompetencji testKompetencji) throws Exception {
        if (allTestKompetencjis.contains(testKompetencji)) {
            throw new Exception("Given testKompetencji is already connected with a Rekrutacja");
        }

        if (this.testKompetencji != null) {
            allTestKompetencjis.remove(this.testKompetencji);
        }

        this.testKompetencji = testKompetencji;
        allTestKompetencjis.add(testKompetencji);
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public String getOpis() {
        return opis;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public List<String> getWymagania() {
        return wymagania;
    }

    public RekrutacjaMediator getRekrutacjaMediator() {
        return rekrutacjaMediator;
    }

    public Rekruter getRekruter() {
        return rekruter;
    }

    public TestKompetencji getTestKompetencji() {
        return testKompetencji;
    }
}
