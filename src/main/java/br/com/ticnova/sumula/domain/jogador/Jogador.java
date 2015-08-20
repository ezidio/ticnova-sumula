package br.com.ticnova.sumula.domain.jogador;

import br.com.ticnova.sumula.domain.clube.Clube;
import br.com.ticnova.sumula.domain.jogador.JogadorCategoria;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.emptyToNull;

/**
 * Jogador
 */
@Entity
public class Jogador {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Clube clube;

    @NotEmpty
    private String inscricao;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String apelido;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private JogadorCategoria categoria;


    public Jogador(String inscricao, String apelido, String nome) {
        this.inscricao = checkNotNull(emptyToNull(inscricao), "O numero de inscrição deve ser informado.");
        this.setApelido(apelido);
        this.setNome(nome);
        this.categoria = JogadorCategoria.AMADOR;
    }

    public Long getId() {
        return id;
    }

    public String getInscricao() {
        return inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = checkNotNull(emptyToNull(nome), "O nome deve ser informado.");
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = checkNotNull(emptyToNull(apelido), "O apelido deve ser informado.");
    }

    public JogadorCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(JogadorCategoria categoria) {
        this.categoria = categoria;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}
