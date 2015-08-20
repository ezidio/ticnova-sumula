package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.jogador.Jogador;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Jogador relacionado pelo time
 */
@Entity
@FilterDef(name = "time", parameters = @ParamDef(name="clube", type = "integer"))
public class JogadorRelacionado {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Jogador jogador;

    private Integer numero;

    private String tipoEscalacao;

    @ManyToOne
    private Relacao relacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipoEscalacao() {
        return tipoEscalacao;
    }

    public void setTipoEscalacao(String tipoEscalacao) {
        this.tipoEscalacao = tipoEscalacao;
    }

    public Relacao getRelacao() {
        return relacao;
    }

    public void setRelacao(Relacao relacao) {
        this.relacao = relacao;
    }
}
