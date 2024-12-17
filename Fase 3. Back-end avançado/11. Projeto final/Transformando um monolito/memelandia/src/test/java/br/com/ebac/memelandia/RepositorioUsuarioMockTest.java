package br.com.ebac.memelandia;

import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RepositorioUsuarioMockTest {

    @Mock
    private RepositorioUsuario repositorioUsuario;

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
        usuario.setNome("João");
        usuario.setEmail("joao@example.com");
    }

    @Test
    public void testSalvarUsuario() {
        when(repositorioUsuario.save(usuario)).thenReturn(usuario);

        Usuario savedUsuario = repositorioUsuario.save(usuario);
        assertNotNull(savedUsuario);
        assertEquals("João", savedUsuario.getNome());
        verify(repositorioUsuario, times(1)).save(usuario);
    }

    @Test
    public void testListarUsuarios() {
        when(repositorioUsuario.findAll()).thenReturn(List.of(usuario));

        List<Usuario> usuarios = repositorioUsuario.findAll();
        assertEquals(1, usuarios.size());
        verify(repositorioUsuario, times(1)).findAll();
    }
}

