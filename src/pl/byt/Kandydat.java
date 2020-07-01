package pl.byt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kandydat {
    private String email;
    private String imie;
    private String nazwisko;
    private String pesel;

    private CV cv;
    public static Set<CV> allCVs = new HashSet<>();

    private List<Aplikacja> aplikacjas = new ArrayList<>();

    public void setCV(CV cv) throws Exception {
        if (allCVs.contains(cv)) {
            throw new Exception("Given CV is already connected with a Kandydat");
        }

        this.cv = cv;
        allCVs.add(cv);
    }

    public void addAplikacja(Aplikacja aplikacja) {
        if (!aplikacjas.contains(aplikacja)) {
            aplikacjas.add(aplikacja);
            aplikacja.setKandydat(this);
        }
    }

    public void removeAplikacja(Aplikacja aplikacja) {
        aplikacjas.remove(aplikacja);
    }

    public static void usun() {

    }

    public void wyswietlProfil() {

    }
}
