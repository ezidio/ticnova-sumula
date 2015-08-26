package br.com.ticnova.sumula.domain.clube;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.emptyToNull;


/**
 * Clube de futebol
 */
@Entity
public class Clube {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String estado;

    public Clube(String nome, String estado) {
        this.nome = checkNotNull(emptyToNull(nome), "O nome deve ser informado");
        this.estado = checkNotNull(emptyToNull(estado), "O estado deve ser informado");
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clube clube = (Clube) o;
        return Objects.equals(id, clube.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
