package br.com.ticnova.sumula.domain.campeonato;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

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

    @NotNull(message = "Inicio do campeonato é obrigatório")
    private Date inicio;

    @NotNull(message = "Fim do campeonato é obrigatório")
    private Date fim;

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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
}
