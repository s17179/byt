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

    private Rekruter rekruter;

    private Rekrutacja(
            RekrutacjaMediator rekrutacjaMediator,
            String initialWymaganie,
            Rekruter rekruter
    ) {
        this.rekrutacjaMediator = rekrutacjaMediator;
        this.rekruter = rekruter;
        wymagania.add(initialWymaganie);
    }

    public static Rekrutacja createRekrutacja(
            RekrutacjaMediator rekrutacjaMediator,
            String initialWymagania,
            Rekruter rekruter
    ) throws Exception {
        if (rekrutacjaMediator == null) {
            throw new Exception("Given rekrutacjaMediator cannot be null");
        }

        Rekrutacja rekrutacja = new Rekrutacja(rekrutacjaMediator, initialWymagania, rekruter);

        rekrutacjaMediator.setRekrutacja(rekrutacja);

        return rekrutacja;
    }

    public void setRekruter(Rekruter rekruter) {
        if (this.rekruter != null && this.rekruter != rekruter) {
            rekruter.removeRekrutacja(this);
        }

        this.rekruter = rekruter;
        rekruter.addRekrutacja(this);
    }
}
