package pl.byt;

public class TestKompetencji {
    private int minimalnaIloscPoprawnychOdpowiedzi;
    private String nazwa;

    private Rekrutacja rekrutacja;

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
}
