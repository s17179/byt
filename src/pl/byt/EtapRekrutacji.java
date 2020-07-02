package pl.byt;

import java.util.ArrayList;
import java.util.List;

public class EtapRekrutacji {
    private boolean czyWymaganyRekruterSpecjalista;
    private String nazwa;
    private List<String> tagi = new ArrayList<>();

    private RekrutacjaMediator rekrutacjaMediator;

    private EtapRekrutacji nastepny;

    private RekruterSpecjalista rekruterSpecjalista;

    private EtapRekrutacji(
            RekrutacjaMediator rekrutacjaMediator,
            boolean czyWymaganyRekruterSpecjalista,
            String nazwa
    ) {
        this.rekrutacjaMediator = rekrutacjaMediator;
        this.czyWymaganyRekruterSpecjalista = czyWymaganyRekruterSpecjalista;
        this.nazwa = nazwa;
    }

    public static EtapRekrutacji createEtapRekrutacji(RekrutacjaMediator rekrutacjaMediator,
                                                      boolean czyWymaganyRekruterSpecjalista,
                                                      String nazwa) throws Exception {
        if (rekrutacjaMediator == null) {
            throw new Exception("Given rekrutacjaMediator cannot be null");
        }

        EtapRekrutacji etapRekrutacji = new EtapRekrutacji(
                rekrutacjaMediator,
                czyWymaganyRekruterSpecjalista,
                nazwa
        );

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

    public void setRekruterSpecjalista(RekruterSpecjalista rekruterSpecjalista) {
        if (this.rekruterSpecjalista != null && this.rekruterSpecjalista != rekruterSpecjalista) {
            rekruterSpecjalista.removeEtapRekrutacji(this);
        }

        this.rekruterSpecjalista = rekruterSpecjalista;
        rekruterSpecjalista.addEtapRekrutacji(this);
    }

    public boolean isCzyWymaganyRekruterSpecjalista() {
        return czyWymaganyRekruterSpecjalista;
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<String> getTagi() {
        return tagi;
    }

    public RekrutacjaMediator getRekrutacjaMediator() {
        return rekrutacjaMediator;
    }

    public EtapRekrutacji getNastepny() {
        return nastepny;
    }

    public RekruterSpecjalista getRekruterSpecjalista() {
        return rekruterSpecjalista;
    }
}
