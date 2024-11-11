package br.com.ebac.animalservice.entidades;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, name = "nome_provisorio")
    private String nomeProvisorio;

    @Column(nullable = false, name = "tipo_animal")
    private String tipoAnimal;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false, name = "idade_estimada")
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false, name = "condicoes_chegada")
    private String condicoesChegada;

    @Column(nullable = false, name = "nome_recebedor")
    private String nomeRecebedor;

    @Column(name = "data_obito")
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false, name = "data_entrada")
    private Date dataEntrada;

    @Column(name = "data_adocao")
    private Date dataAdocao;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private IdStatus idStatus;

    // Getters e Setters

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public IdStatus getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(IdStatus idStatus) {
        this.idStatus = idStatus;
    }
}
