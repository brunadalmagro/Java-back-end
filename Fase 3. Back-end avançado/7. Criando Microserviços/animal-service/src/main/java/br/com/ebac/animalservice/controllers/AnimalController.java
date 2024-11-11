package br.com.ebac.animalservice.controllers;

import br.com.ebac.animalservice.entidades.Animal;
import br.com.ebac.animalservice.repositories.AnimalRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalRepository repository;

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

    // Econtrar por tipo de animal
    @GetMapping("/animal-types")
    private List<String> findAnimalTypes(){
        return repository.findDistinctAnimalTypes();
    }

    // Encontrar status de todos
    @GetMapping("/all-status")
    private List<Object[]> findAllAnimalsStatus() {
        return repository.findAllAnimalsWithStatus();
    }

    // Encontrar animais adotados
    @GetMapping("/adopted-status")
    private List<Animal> findAdoptedWithStatus() {
        return repository.findAdoptedAnimalsWithStatus();
    }

    // Encontrar animais disponíveis
    @GetMapping("/available-status")
    private List<Animal> findAvailableWithStatus() {
        return repository.findAvailableAnimalsWithStatus();
    }


    // Contagem de animais resgatados por cada funcionário no último ano
    @GetMapping("/count-animals-resgatados")
    public ResponseEntity<Map<String, Long>> getCountAnimalsByEmployeeLastYear() {
        // Data de um ano atrás a partir da data atual
        LocalDate startDate = LocalDate.now().minusYears(1);
        LocalDate endDate = LocalDate.now();

        // Chamada ao repositório para buscar a contagem
        List<Object[]> resultList = repository.countAnimalsByEmployee(startDate, endDate);

        // Converte a lista de resultados em um Map<String, Long>
        Map<String, Long> resultMap = resultList.stream()
                .collect(Collectors.toMap(
                        object -> (String) object[0],   // O primeiro elemento do array é o nome do recebedor
                        object -> (Long) object[1]      // O segundo elemento do array é a contagem
                ));

        return ResponseEntity.ok(resultMap);
    }
}
