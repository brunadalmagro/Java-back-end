package br.com.ebac.animalservice.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class IdStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "idStatus")
    private List<Animal> animais;

    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
