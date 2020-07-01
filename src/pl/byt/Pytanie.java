package pl.byt;

public class Pytanie {
    private String tresc;

    private TestKompetencji testKompetencji;

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
}
