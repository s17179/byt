package pl.byt;

public class Ocena {
    private String notatka;
    private int wartosc;

    private RekrutacjaMediator rekrutacjaMediator;

    public Ocena(
            RekrutacjaMediator rekrutacjaMediator,
            String notatka,
            int wartosc
    ) {
        this.rekrutacjaMediator = rekrutacjaMediator;
        this.notatka = notatka;
        this.wartosc = wartosc;
    }

    public void setRekrutacjaMediator(RekrutacjaMediator rekrutacjaMediator) {
        if (this.rekrutacjaMediator == rekrutacjaMediator) {
            return;
        }

        if (this.rekrutacjaMediator != null) {
            rekrutacjaMediator.removeOcena(this);
        }

        this.rekrutacjaMediator = rekrutacjaMediator;
        rekrutacjaMediator.addOcena(this);
    }

    public String getNotatka() {
        return notatka;
    }

    public int getWartosc() {
        return wartosc;
    }

    public RekrutacjaMediator getRekrutacjaMediator() {
        return rekrutacjaMediator;
    }
}
