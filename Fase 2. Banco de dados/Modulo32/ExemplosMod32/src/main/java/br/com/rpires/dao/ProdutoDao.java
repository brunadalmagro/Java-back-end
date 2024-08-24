package br.com.rpires.dao;

import javax.persistence.*;

import br.com.rpires.domain.Produto;

import java.util.List;

public class ProdutoDao implements IProdutoDao {

    private EntityManagerFactory entityManagerFactory;

    public ProdutoDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
    }

    @Override
    public Produto cadastrar(Produto produto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(produto);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao cadastrar o produto", e);
        } finally {
            entityManager.close();
        }
        return produto;
    }

    @Override
    public Produto buscarPorId(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(Produto.class, id);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void excluir(Produto produto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(entityManager.contains(produto) ? produto : entityManager.merge(produto));
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao excluir o produto", e);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Produto> buscarTodos() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            TypedQuery<Produto> query = entityManager.createQuery("SELECT p FROM Produto p", Produto.class);
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}
