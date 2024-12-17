package br.com.ebac.memelandia;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MemeControllerTest {

    @Autowired
    private RepositorioMeme repositorioMeme;

    private Meme meme;

    @BeforeEach
    public void setUp() {
        meme = new Meme();
        meme.setNome("Meme Aleatório");
        meme.setDescricao("Descrição do meme");
        meme.setDataCadastro(java.sql.Date.valueOf(LocalDateTime.now().toLocalDate()));
        repositorioMeme.save(meme);
    }

    @Test
    public void testGetMemeAleatorio() {
        Meme memeAleatorio = repositorioMeme.findRandomMeme().orElse(null);
        assertNotNull(memeAleatorio);
        assertEquals(meme.getNome(), memeAleatorio.getNome());
    }
}
