/**
 * 
 */
package br.com.bdal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.bdal.dao.ClienteDAO;
import br.com.bdal.dao.IClienteDAO;
import br.com.bdal.domain.Cliente;

import java.util.List;

/**
 * @author Bruna D.
 *
 */
public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

	@Test
	public void consultarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Preparar um cliente para consulta
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		dao.cadastrar(cliente);

		// Consultar o cliente
		Cliente clienteConsultado = dao.consultar(cliente.getCodigo());

		// Verificar se o cliente consultado é o mesmo que foi cadastrado
		assertNotNull(clienteConsultado);
		assertNotNull(clienteConsultado.getId());
		assertEquals(cliente.getCodigo(), clienteConsultado.getCodigo());
		assertEquals(cliente.getNome(), clienteConsultado.getNome());

		Integer qtdDel = dao.excluir(cliente);
		assertNotNull(qtdDel);
	}

	@Test
	public void excluirTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Preparar um cliente para exclusão
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		dao.cadastrar(cliente);

		// Excluir o cliente
		Integer qtdExclusao = dao.excluir(cliente);

		// Verificar se a exclusão foi bem-sucedida
		assertNotNull(qtdExclusao);
		assertTrue(qtdExclusao > 0);

		Integer qtdDel = dao.excluir(cliente);
		assertNotNull(qtdDel);
	}

	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Cadastrar um cliente para atualização
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		dao.cadastrar(cliente);

		// Atualizar o nome do cliente
		cliente.setNome("Ana Silva");
		Integer qtdAtualizacao = dao.atualizar(cliente);

		// Verificar se a atualização foi bem-sucedida
		assertNotNull(qtdAtualizacao);
		assertTrue(qtdAtualizacao > 0);

		Integer qtdDel = dao.excluir(cliente);
		assertNotNull(qtdDel);
	}

	@Test
	public void buscarTodosTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		// Cadastrar alguns clientes para busca
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo("01");
		cliente1.setNome("Rodrigo Pires");
		dao.cadastrar(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setCodigo("02");
		cliente2.setNome("Maria Silva");
		dao.cadastrar(cliente2);

		// Buscar todos os clientes
		List<Cliente> clientes = dao.buscarTodos();

		// Verificar se a lista de clientes contém os clientes cadastrados
		assertEquals(clientes.size(), 2);

		Integer qtdDel = dao.excluir(cliente1) +  dao.excluir(cliente2);
		assertEquals(qtdDel.intValue(), 2);

		// Verificar se, após a exclusão de todos os clientes, a lista está vazia
		List<Cliente> clientesEmpty = dao.buscarTodos();
		assertEquals(clientesEmpty.size(), 0);
	}
}

