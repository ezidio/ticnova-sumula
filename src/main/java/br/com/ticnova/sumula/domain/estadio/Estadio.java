package br.com.ticnova.sumula.domain.estadio;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.emptyToNull;

/**
 * Estádio onde são realizado os jogos
 */
@Entity
public class Estadio {

    @Id
    private Long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String cidade;

    @NotEmpty
    private String estado;

    public Estadio(String nome, String cidade, String estado) {
        this.setNome(this.nome);
        this.cidade = checkNotNull(emptyToNull(cidade), "O cidade deve ser informado");
        this.estado = checkNotNull(emptyToNull(estado), "O estado deve ser informado");

    }

    public Long getId() {
        return id;
    }

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = checkNotNull(emptyToNull(nome), "O nome deve ser informado");
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
