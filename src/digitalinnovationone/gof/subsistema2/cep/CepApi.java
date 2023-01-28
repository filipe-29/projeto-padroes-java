package digitalinnovationone.gof.subsistema2.cep;

import digitalinnovationone.gof.singleton.Singleton;

public class CepApi {
    private static CepApi instancia;

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "RJ";
    }
}
