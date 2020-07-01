package pl.byt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rekrutacja {
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private String opis;
    private String stanowisko;
    private List<String> wymagania = new ArrayList<>();

    private RekrutacjaMediator rekrutacjaMediator;

    private Rekrutacja(RekrutacjaMediator rekrutacjaMediator, String initialWymaganie) {
        this.rekrutacjaMediator = rekrutacjaMediator;
        wymagania.add(initialWymaganie);
    }

    public static Rekrutacja createRekrutacja(RekrutacjaMediator rekrutacjaMediator, String initialWymagania) throws Exception {
        if (rekrutacjaMediator == null) {
            throw new Exception("Given rekrutacjaMediator cannot be null");
        }

        Rekrutacja rekrutacja = new Rekrutacja(rekrutacjaMediator, initialWymagania);

        rekrutacjaMediator.setRekrutacja(rekrutacja);

        return rekrutacja;
    }
}
