package br.com.ebac.memelandia;

import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RepositorioUsuarioTest {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
        usuario.setNome("Ana Banana");
        usuario.setEmail("anananana@dominio.com");
        usuario.setDataCadastro(LocalDate.now());
        repositorioUsuario.save(usuario);
    }

    @Test
    public void testSaveUsuario() {
        Usuario savedUsuario = repositorioUsuario.save(usuario);
        assertNotNull(savedUsuario.getId());
        assertEquals("Ana Banana", savedUsuario.getNome());
    }

    @Test
    public void testFindUsuarioById() {
        Usuario savedUsuario = repositorioUsuario.save(usuario);
        Usuario foundUsuario = repositorioUsuario.findById(savedUsuario.getId()).orElse(null);
        assertNotNull(foundUsuario);
        assertEquals(savedUsuario.getId(), foundUsuario.getId());
    }

    @Test
    public void testDeleteUsuario() {
        Usuario savedUsuario = repositorioUsuario.save(usuario);
        repositorioUsuario.delete(savedUsuario);
        assertFalse(repositorioUsuario.existsById(savedUsuario.getId()));
    }
}
