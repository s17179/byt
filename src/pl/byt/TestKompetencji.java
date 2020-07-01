package pl.byt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestKompetencji {
    private int minimalnaIloscPoprawnychOdpowiedzi;
    private String nazwa;

    private Rekrutacja rekrutacja;

    private List<Pytanie> pytanies = new ArrayList<>();
    public static Set<Pytanie> allPytanies = new HashSet<>();

    private TestKompetencji(Rekrutacja rekrutacja) {
        this.rekrutacja = rekrutacja;
    }

    public static TestKompetencji createTestKompetencji(Rekrutacja rekrutacja) throws Exception {
        if (rekrutacja == null) {
            throw new Exception("Given rekrutacja cannot be null");
        }

        TestKompetencji testKompetencji = new TestKompetencji(rekrutacja);

        rekrutacja.setTestKompetencji(testKompetencji);

        return testKompetencji;
    }

    public void addPytanie(Pytanie pytanie) throws Exception {
        if (pytanies.size() == 25) {
            throw new Exception("Size of pytanies cannot be greater than 25");
        }

        if (!pytanies.contains(pytanie)) {
            if (allPytanies.contains(pytanie)) {
                throw new Exception("Given pytanie is already connected with a TestKompetencji");
            }

            pytanies.add(pytanie);
            allPytanies.add(pytanie);
        }
    }

    public int getMinimalnaIloscPoprawnychOdpowiedzi() {
        return minimalnaIloscPoprawnychOdpowiedzi;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Rekrutacja getRekrutacja() {
        return rekrutacja;
    }

    public List<Pytanie> getPytanies() {
        return pytanies;
    }
}
