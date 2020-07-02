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

    private List<Aplikacja> aplikacjaList = new ArrayList<>();

    public Kandydat(String email, String imie, String nazwisko, String pesel) {
        this.email = email;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void setCV(CV cv) throws Exception {
        if (allCVs.contains(cv)) {
            throw new Exception("Given CV is already connected with a Kandydat");
        }

        if (this.cv != null) {
            allCVs.remove(this.cv);
        }

        this.cv = cv;
        allCVs.add(cv);
    }

    public void addAplikacja(Aplikacja aplikacja) {
        if (!aplikacjaList.contains(aplikacja)) {
            aplikacjaList.add(aplikacja);
            aplikacja.setKandydat(this);
        }
    }

    public void removeAplikacja(Aplikacja aplikacja) {
        aplikacjaList.remove(aplikacja);
    }

    public static void usun() {

    }

    public void wyswietlProfil() {

    }

    public String getEmail() {
        return email;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public CV getCv() throws Exception {
        if (cv == null) {
            throw new Exception("CV is not set");
        }

        return cv;
    }

    public List<Aplikacja> getAplikacjaList() {
        return aplikacjaList;
    }
}
