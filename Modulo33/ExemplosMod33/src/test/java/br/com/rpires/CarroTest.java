package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.ICarroDao;
import br.com.rpires.dao.IMarcaDao;
import br.com.rpires.dao.CarroDao;
import br.com.rpires.dao.MarcaDao;
import br.com.rpires.domain.Carro;
import br.com.rpires.domain.Marca;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;

    public CarroTest() {
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

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
