package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.clube.Clube;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Cartao dado durante o jogo
 */
@Entity
public class Cartao {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O tipo do cartão deve ser informado.")
    @Enumerated(EnumType.STRING)
    private TipoCartao tipo;

    @NotNull
    @ManyToOne
    private Sumula sumula;

    @NotNull(message = "O jogador que levou o cartão deve ser informado")
    @ManyToOne
    private JogadorRelacionado jogador;

    @NotEmpty(message = "O motivo do cartão deve ser informado.")
    private String motivo;

    public Long getId() {
        return id;
    }

    public TipoCartao getTipo() {
        return tipo;
    }

    public void setTipo(TipoCartao tipo) {
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

}
