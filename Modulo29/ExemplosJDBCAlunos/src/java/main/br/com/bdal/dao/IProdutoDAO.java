package br.com.bdal.dao;
import br.com.bdal.domain.Produto;

/**
 * @author Bruna  D.
 *
 */

import java.util.List;

public interface IProdutoDAO {
    void adicionarProduto(Produto produto);
    Produto buscarProdutoPorId(int id);
    List<Produto> listarProdutos();
    void atualizarProduto(Produto produto);
    void removerProduto(int id);
}
