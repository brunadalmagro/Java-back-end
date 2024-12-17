package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.services.ServicoCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/categorias")
    public class ControllerCategoriaMeme {

        @Autowired
        private ServicoCategoriaMeme servicoCategoriaMeme;

        @GetMapping
        public List<CategoriaMeme> buscaCategorias() {
            return servicoCategoriaMeme.listaTodasCategorias();
        }

        @PostMapping
        public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
            return servicoCategoriaMeme.novaCategoriaMeme(categoriaMeme);
        }
    }
