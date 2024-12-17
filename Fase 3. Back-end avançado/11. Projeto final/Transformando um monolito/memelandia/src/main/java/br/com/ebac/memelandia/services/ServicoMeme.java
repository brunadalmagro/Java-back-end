package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class ServicoMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public Meme memeAleatorio() {
        List<Meme> memes = repositorioMeme.findAll();
        Random random = new Random();
        return memes.get(random.nextInt(memes.size()));
    }

    public void salvarMeme(LocalDateTime dataCadastro) {
        Meme meme = new Meme();
        meme.setDataCadastro(java.sql.Date.valueOf(dataCadastro.toLocalDate()));
        repositorioMeme.save(meme);
    }
}

