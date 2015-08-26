package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;
import br.com.ticnova.sumula.domain.jogador.Jogador;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Gols acontecidos na partida
 */
@Entity
public class Gol {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O tempo do gol deve ser informado")
    @Column(nullable = false)
    private Integer tempo;

    @ManyToOne
    private Sumula sumula;

    @NotNull(message = "O jogador que marcou o gol deve ser informado")
    @ManyToOne
    @Column(nullable = false)
    private Jogador jogador;

    @ManyToOne
    @NotNull(message = "O clube a qual foi o gol deve ser informado")
    @Column(nullable = false)
    private Clube clube;

    @NotNull(message = "O tipo de gol deve ser informado.")
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDeGol tipo;

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

    public TipoDeGol getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeGol tipo) {
        this.tipo = tipo;
    }
}
