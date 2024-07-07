package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.modelo.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author estelaAlmeida
 */
public interface ClienteService {

    Interable<Cliente> buscarTodos();

    cliente buscarPorId(Long id);

    void inserir(cliente cliente);

    void atualizar(long id, Cliente cliente);

    void deletar(long id);

}
