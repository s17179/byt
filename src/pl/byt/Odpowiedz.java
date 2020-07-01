package pl.byt;

public class Odpowiedz {
    private boolean czyPoprawna;
    private String tresc;

    private Pytanie pytanie;

    private Odpowiedz(Pytanie pytanie) {
        this.pytanie = pytanie;
    }

    public static Odpowiedz createOdpowiedz(Pytanie pytanie) throws Exception {
        if (pytanie == null) {
            throw new Exception("Given pytanie cannot be null");
        }

        Odpowiedz odpowiedz = new Odpowiedz(pytanie);

        pytanie.addOdpowiedz(odpowiedz);

        return odpowiedz;
    }

    public boolean isPoprawna() {
        return czyPoprawna;
    }

    public String getTresc() {
        return tresc;
    }

    public Pytanie getPytanie() {
        return pytanie;
    }

    public boolean isCzyPoprawna() {
        return czyPoprawna;
    }
}
