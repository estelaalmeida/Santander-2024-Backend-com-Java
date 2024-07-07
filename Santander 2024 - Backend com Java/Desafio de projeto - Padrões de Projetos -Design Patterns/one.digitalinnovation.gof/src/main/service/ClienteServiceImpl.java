import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    // TODO Singleton Insere oas componentes do Spring com @Autorired*/
    @Autowired
    private ClienteRepository clienteRepositiry;

    @Autowired
    private EnderecoRepository enderecoRepositiry;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscatTodos() {
        return clienterepositiry.findAll();
    }

    @Override
    public Cliente buscarPorId(long id) {
        Optional<Cliente> cliente = clienterepositiry.findBayId(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        getCep(cliente);

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienterepositiry.findBayId(id);
        if (clienteBd.isPresent()) {
            getCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepositiry.delitefindBayId(id);
    }
}
