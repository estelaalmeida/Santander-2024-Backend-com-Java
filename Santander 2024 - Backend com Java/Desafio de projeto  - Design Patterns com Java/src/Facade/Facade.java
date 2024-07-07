package Facade;


import Subsistema1CRM.CrmService;
import Subsistema2CEP.CepApi;

/**
 * @author estel
 */
public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome,cep,cidade, estado);

    }
}
