package pl.byt;

import java.util.Date;

public class Aplikacja {
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private String status;

    private Kandydat kandydat;
    private RekrutacjaMediator rekrutacjaMediator;

    public Aplikacja(Kandydat kandydat, RekrutacjaMediator rekrutacjaMediator) {
        setKandydat(kandydat);
        setRekrutacjaMediator(rekrutacjaMediator);
    }

    public void setKandydat(Kandydat kandydat) {
        if (this.kandydat != null && this.kandydat != kandydat) {
            kandydat.removeAplikacja(this);
        }

        this.kandydat = kandydat;
        kandydat.addAplikacja(this);
    }

    public void setRekrutacjaMediator(RekrutacjaMediator rekrutacjaMediator) {
        if (this.rekrutacjaMediator != null && this.rekrutacjaMediator != rekrutacjaMediator) {
            rekrutacjaMediator.removeAplikacja(this);
        }

        this.rekrutacjaMediator = rekrutacjaMediator;
        rekrutacjaMediator.addAplikacja(this);
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public String getStatus() {
        return status;
    }

    public Kandydat getKandydat() {
        return kandydat;
    }

    public RekrutacjaMediator getRekrutacjaMediator() {
        return rekrutacjaMediator;
    }
}
