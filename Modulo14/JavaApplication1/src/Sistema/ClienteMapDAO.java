package Sistema;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementação de DAO de Cliente usando um mapa.
 * Esta classe permite cadastrar, consultar, alterar e excluir clientes em um mapa.
 * 
 * @author Bruna
 */
public class ClienteMapDAO implements IClienteDAO {

    private final Map<Long, Cliente> map;

    /**
     * Construtor padrão da classe ClienteMapDAO.
     * Inicializa o mapa que será usado para armazenar os clientes.
     */
    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setSobrenome(cliente.getSobrenome());
            clienteCadastrado.setTelefone(cliente.getTelefone());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setCep(cliente.getCep());
        }
    }
    
    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

    void excluir(String cpfExcluir) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
