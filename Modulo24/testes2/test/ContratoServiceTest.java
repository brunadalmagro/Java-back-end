import br.com.testept2.dao.ContratoDao;
import br.com.testept2.dao.IContratoDao;
import br.com.testept2.dao.mock.ContratoDaoMock;
import br.com.testept2.service.ContratoService;
import br.com.testept2.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarContratoTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        // Simulação de contrato válido
        int contratoId = 1;
        ContratoService contrato = service.buscarContrato(contratoId);

        // Validação
        Assert.assertNotNull(contrato);
        Assert.assertEquals(contratoId, contrato.getId());
    }

    @Test
    public void excluirContratoTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        int contratoID = 1;
        boolean excluido = service.excluirContrato(contratoID);

        Assert.assertTrue(excluido);
    }

    @Test
    public void atualizarContratoTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);

        ContratoDaoMock contrato = new ContratoDaoMock();
        contrato.setValorTotal(1500.0);

        service.atualizarContrato(contrato);

        Assert.assertEquals(1500.0, contrato.getValorTotal(), 0.01);
    }
}
