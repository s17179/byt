package pl.byt;

import java.util.Date;

public class Aplikacja {
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private String status;

    private Kandydat kandydat;

    public Aplikacja(Kandydat kandydat) {
        setKandydat(kandydat);
    }

    public void setKandydat(Kandydat kandydat) {
        if (this.kandydat != null && this.kandydat != kandydat) {
            kandydat.removeAplikacja(this);
        }

        this.kandydat = kandydat;
        kandydat.addAplikacja(this);
    }
}
