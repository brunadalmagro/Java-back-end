package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.dao.IProdutoDao;
import br.com.rpires.dao.ProdutoDao;
import br.com.rpires.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    @Before
    public void setUp() {
        produtoDao = new ProdutoDao();
    }

    @After
    public void tearDown() {
        // Limpar o estado do banco de dados após cada teste
        List<Produto> produtos = produtoDao.buscarTodos();
        for (Produto produto : produtos) {
            produtoDao.excluir(produto);
        }
    }

    @Test
    public void testCadastrarProduto() {
        Produto produto = new Produto();
        produto.setNome("Produto Teste");
        produto.setPreco(100.0);

        Produto produtoCadastrado = produtoDao.cadastrar(produto);

        assertNotNull(produtoCadastrado.getId());
        assertEquals("Produto Teste", produtoCadastrado.getNome());
        assertEquals(100.0, produtoCadastrado.getPreco(), 0.001); // Comparação de double com precisão
    }

    @Test
    public void testBuscarPorId() {
        Produto produto = new Produto();
        produto.setNome("Produto Busca");
        produto.setPreco(200.0);

        produtoDao.cadastrar(produto);

        Produto produtoRecuperado = produtoDao.buscarPorId(produto.getId());

        assertNotNull(produtoRecuperado);
        assertEquals("Produto Busca", produtoRecuperado.getNome());
        assertEquals(200.0, produtoRecuperado.getPreco(), 0.001);
    }
}
