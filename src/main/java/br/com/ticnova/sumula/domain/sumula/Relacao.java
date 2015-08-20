package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;

import javax.persistence.*;
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
    private Clube clube;

    @OneToMany(mappedBy = "relacao")
    private List<JogadorRelacionado> jogadores;

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

    public List<JogadorRelacionado> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<JogadorRelacionado> jogadores) {
        this.jogadores = jogadores;
    }
}
