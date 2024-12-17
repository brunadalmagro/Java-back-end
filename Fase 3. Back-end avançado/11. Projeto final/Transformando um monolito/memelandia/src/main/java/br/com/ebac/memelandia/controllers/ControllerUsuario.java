package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/usuarios")
    public class ControllerUsuario {

        @Autowired
        private ServicoUsuario servicoUsuario;

        @GetMapping
        public List<Usuario> buscaUsuarios() {
            return servicoUsuario.listaTodosUsuarios();
        }

        @PostMapping
        public Usuario novoUsuario(@RequestBody Usuario usuario) {
            return servicoUsuario.novoUsuario(usuario);
        }
    }