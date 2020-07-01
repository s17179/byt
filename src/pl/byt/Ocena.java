package pl.byt;

public class Ocena {
    private String notatka;
    private int wartosc;

    private RekrutacjaMediator rekrutacjaMediator;

    public Ocena(RekrutacjaMediator rekrutacjaMediator) {
        this.rekrutacjaMediator = rekrutacjaMediator;
    }

    public void setRekrutacjaMediator(RekrutacjaMediator rekrutacjaMediator) {
        if (this.rekrutacjaMediator != null && this.rekrutacjaMediator != rekrutacjaMediator) {
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
