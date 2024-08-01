package io.github.evertontech.api_produtos.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Float preco;

    private Boolean disponivel;

    private Double peso;

    private Character categoria;

    public Produto() {
        this.disponivel = true;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao = descricao;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getPreco() {
        return this.preco;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Boolean isDisponivel() {
        return this.disponivel;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public Character getCategoria() {
        return this.categoria;
    }
}
