package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Cartao dado durante o jogo
 */
@Entity
public class Cartao {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String tipo;

    @NotNull
    @ManyToOne
    private Sumula sumula;

    @NotNull
    @ManyToOne
    private JogadorRelacionado jogador;

    @NotEmpty
    private String motivo;

    @NotNull
    @ManyToOne
    private Clube clube;


    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sumula getSumula() {
        return sumula;
    }

    public void setSumula(Sumula sumula) {
        this.sumula = sumula;
    }

    public JogadorRelacionado getJogador() {
        return jogador;
    }

    public void setJogador(JogadorRelacionado jogador) {
        this.jogador = jogador;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}
