package br.com.ebac.memelandia.repositories;

import br.com.ebac.memelandia.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioMeme extends JpaRepository<Meme, Long> {

    // Adiciona um método para buscar um meme aleatório
    Optional<Meme> findTopByOrderByIdAsc();

    // Usando um SELECT com LIMIT para pegar um aleatório
    @Query("SELECT m FROM Meme m ORDER BY RAND()")
    Optional<Meme> findRandomMeme();

}
