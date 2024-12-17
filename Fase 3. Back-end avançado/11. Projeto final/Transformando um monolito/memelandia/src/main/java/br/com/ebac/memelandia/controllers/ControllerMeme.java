package br.com.ebac.memelandia.controllers;


import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import br.com.ebac.memelandia.services.ServicoMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @Autowired
    private RepositorioMeme repositorioMeme;

    @GetMapping
    public List<Meme> buscaMemes() {
        return servicoMeme.listaTodosMemes();
    }

    @PostMapping
    public Meme novoMeme(@RequestBody Meme meme) {
        return servicoMeme.novoMeme(meme);
    }

    // Endpoint para retornar um meme aleatório
    @GetMapping("/aleatorio")
    public Meme getMemeAleatorio() {
        Optional<Meme> meme = repositorioMeme.findRandomMeme();
        return meme.orElse(null);  // Retorna o meme ou null caso não encontre nenhum
    }

}

