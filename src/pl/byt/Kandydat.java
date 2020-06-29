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

    private List<CV> cvs = new ArrayList<>();
    public static Set<CV> allCVs = new HashSet<>();

    public void addCV(CV cv) throws Exception {
        if (!cvs.contains(cv)) {
            if (allCVs.contains(cv)) {
                throw new Exception("Given CV is already connected with a Kandydat");
            }
            cvs.add(cv);
            allCVs.add(cv);
        }
    }

    public static void usun() {

    }

    public void wyswietlProfil() {

    }
}
