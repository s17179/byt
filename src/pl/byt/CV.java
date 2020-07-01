package pl.byt;

import java.util.HashSet;
import java.util.Set;

public class CV {
    private Set<String> wyodrebnioneDane = new HashSet<>();
    private String zdjecie;

    private Kandydat kandydat;

    private CV(Kandydat kandydat) {
        this.kandydat = kandydat;
    }

    public static CV createCV(Kandydat kandydat) throws Exception {
        if (kandydat == null) {
            throw new Exception("Given kandydat cannot be null");
        }

        CV cv = new CV(kandydat);

        kandydat.setCV(cv);

        return cv;
    }

    public Set<String> getWyodrebnioneDane() {
        return wyodrebnioneDane;
    }

    public String getZdjecie() {
        return zdjecie;
    }

    public Kandydat getKandydat() {
        return kandydat;
    }
}
