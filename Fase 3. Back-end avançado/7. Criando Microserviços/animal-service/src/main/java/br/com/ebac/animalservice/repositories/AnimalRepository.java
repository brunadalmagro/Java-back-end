package br.com.ebac.animalservice.repositories;

import br.com.ebac.animalservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("SELECT DISTINCT a.tipoAnimal FROM Animal a")
    List<String> findDistinctAnimalTypes();

    @Query("SELECT a, s.descricao FROM Animal a JOIN a.idStatus s")
    List<Object[]> findAllAnimalsWithStatus();

    @Query("SELECT a FROM Animal a JOIN a.idStatus s WHERE s.descricao = 'Adotado'")
    List<Animal> findAdoptedAnimalsWithStatus();

    @Query("SELECT a FROM Animal a JOIN a.idStatus s WHERE s.descricao = 'Disponível'")
    List<Animal> findAvailableAnimalsWithStatus();

    @Query("SELECT a.nomeRecebedor, COUNT(a) FROM Animal a WHERE a.dataEntrada BETWEEN :startDate AND :endDate GROUP BY a.nomeRecebedor")
    List<Object[]> countAnimalsByEmployee(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

}
