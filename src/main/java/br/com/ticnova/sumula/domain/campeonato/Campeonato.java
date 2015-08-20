package br.com.ticnova.sumula.domain.campeonato;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Detalhes do campeonato
 */
@Entity
public class Campeonato {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Nome do campeonato é obrigatório")
    private String nome;

    @NotNull(message = "Ano do campeonato é obrigatório")
    private Long ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }
}
