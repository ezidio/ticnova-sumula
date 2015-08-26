package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Relação de um clube na sumula
 */
@Entity
public class Relacao {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NotNull(message = "O clube deve ser informado")
    @Column(nullable = false)
    private Clube clube;

    @OneToMany(mappedBy = "relacao")
    @NotEmpty(message = "Os jogadores relacionados devem ser informados")
    private List<JogadorRelacionado> jogadores;

    @NotEmpty(message = "O técnico deve ser informado")
    @Column(nullable = false)
    private String tecnico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<JogadorRelacionado> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<JogadorRelacionado> jogadores) {
        this.jogadores = jogadores;
    }
}
