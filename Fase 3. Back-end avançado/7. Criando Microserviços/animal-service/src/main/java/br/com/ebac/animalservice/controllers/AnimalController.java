package br.com.ebac.animalservice.controllers;

import br.com.ebac.animalservice.entidades.Animal;
import br.com.ebac.animalservice.repositories.AnimalRepository;
import org.apache.coyote.http11.upgrade.UpgradeProcessorInternal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    // End-points
    // retorna animais cadastrados
    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    // criar novos registros
    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    // Encontrar registros dos não adotados
    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findNotAdopted();
    }

    // Encontrar registros dos adotados
    @GetMapping("/adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }
}
