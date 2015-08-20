package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;
import br.com.ticnova.sumula.domain.jogador.Jogador;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Gols acontecidos na partida
 */
@Entity
public class Gol {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Integer tempo;

    @NotNull
    @ManyToOne
    private Sumula sumula;

    @NotNull
    @ManyToOne
    private Jogador jogador;

    @ManyToOne
    private Clube clube;

    @NotNull
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sumula getSumula() {
        return sumula;
    }

    public void setSumula(Sumula sumula) {
        this.sumula = sumula;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
