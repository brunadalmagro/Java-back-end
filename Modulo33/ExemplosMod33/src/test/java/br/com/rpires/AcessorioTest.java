package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.IAcessorioDao;
import br.com.rpires.dao.ICarroDao;
import br.com.rpires.dao.IMarcaDao;
import br.com.rpires.dao.AcessorioDao;
import br.com.rpires.dao.CarroDao;
import br.com.rpires.dao.MarcaDao;
import br.com.rpires.domain.Acessorio;
import br.com.rpires.domain.Carro;
import br.com.rpires.domain.Marca;

public class AcessorioTest {

    private IAcessorioDao acessorioDao;
    private ICarroDao carroDao;
    private IMarcaDao marcaDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setNome("Toyota");
        marca = marcaDao.cadastrar(marca);

        Carro carro = new Carro();
        carro.setModelo("Corolla");
        carro.setMarca(marca);
        carro = carroDao.cadastrar(carro);

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Ar Condicionado");
        acessorio.setCarro(carro);
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
