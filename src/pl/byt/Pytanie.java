package pl.byt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pytanie {
    private String tresc;

    private TestKompetencji testKompetencji;

    private List<Odpowiedz> odpowiedzs = new ArrayList<>();
    public static Set<Odpowiedz> allOdpowiedzs = new HashSet<>();

    private Pytanie(TestKompetencji testKompetencji) {
        this.testKompetencji = testKompetencji;
    }

    public static Pytanie createPytanie(TestKompetencji testKompetencji) throws Exception {
        if (testKompetencji == null) {
            throw new Exception("Given testKompetencji cannot be null");
        }

        Pytanie pytanie = new Pytanie(testKompetencji);

        testKompetencji.addPytanie(pytanie);

        return pytanie;
    }

    public void addOdpowiedz(Odpowiedz odpowiedz) throws Exception {
        if (hasAtLeastOneCorrectAnswer() && odpowiedz.isPoprawna()) {
            throw new Exception("There can be only one correct answer");
        }

        if (odpowiedzs.size() == 3 && !hasAtLeastOneCorrectAnswer() && !odpowiedz.isPoprawna()) {
            throw new Exception("There must at least on correct answer");
        }

        if (odpowiedzs.size() == 4) {
            throw new Exception("Size of odpowiedzs cannot be greater than 4");
        }

        if (!odpowiedzs.contains(odpowiedz)) {
            if (allOdpowiedzs.contains(odpowiedz)) {
                throw new Exception("Given odpowiedz is already connected with a RekrutacjaMediator");
            }

            odpowiedzs.add(odpowiedz);
            allOdpowiedzs.add(odpowiedz);
        }
    }

    public String getTresc() {
        return tresc;
    }

    public TestKompetencji getTestKompetencji() {
        return testKompetencji;
    }

    public List<Odpowiedz> getOdpowiedzs() {
        return odpowiedzs;
    }

    private boolean hasAtLeastOneCorrectAnswer() {
        for (Odpowiedz odpowiedz : odpowiedzs) {
            if (odpowiedz.isPoprawna()) {
                return true;
            }
        }

        return false;
    }
}
