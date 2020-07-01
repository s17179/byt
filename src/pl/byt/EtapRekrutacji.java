package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class EtapRekrutacji {
    private boolean czyWymaganyRekruterSpecjalista;
    private String nazwa;
    private List<String> tagi = new ArrayList<>();

    private RekrutacjaMediator rekrutacjaMediator;

    private EtapRekrutacji nastepny;

    private EtapRekrutacji(RekrutacjaMediator rekrutacjaMediator) {
        this.rekrutacjaMediator = rekrutacjaMediator;
    }

    public static EtapRekrutacji createEtapRekrutacji(RekrutacjaMediator rekrutacjaMediator) throws Exception {
        if (rekrutacjaMediator == null) {
            throw new Exception("Given rekrutacjaMediator cannot be null");
        }

        EtapRekrutacji etapRekrutacji = new EtapRekrutacji(rekrutacjaMediator);

        rekrutacjaMediator.addEtapRekrutacji(etapRekrutacji);

        return etapRekrutacji;
    }

    public void setNastepny(EtapRekrutacji nastepny) {
        this.nastepny = nastepny;
    }

    public void addTag(String tag) {
        if (czyWymaganyRekruterSpecjalista) {
            tagi.add(tag);
        }
    }
}
