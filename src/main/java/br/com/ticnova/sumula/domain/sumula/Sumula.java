package br.com.ticnova.sumula.domain.sumula;

import br.com.ticnova.sumula.domain.campeonato.Campeonato;
import br.com.ticnova.sumula.domain.estadio.Estadio;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Informações da Sumula de Futebol
 */
@Entity
public class Sumula {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Campeonato campeonato;

    private Integer rodada;

    private Date data;

    @ManyToOne
    private Estadio estadio;

    @ManyToOne
    private Relacao visitante;

    @ManyToOne
    private Relacao casa;

    @OneToMany(mappedBy = "sumula")
    private List<Gol> gols;

    @OneToMany(mappedBy = "sumula")
    private List<Cartao> cartoesAmarelos;

    @OneToMany(mappedBy = "sumula")
    private List<Cartao> cartoesVermelhos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Relacao getVisitante() {
        return visitante;
    }

    public void setVisitante(Relacao visitante) {
        this.visitante = visitante;
    }

    public Relacao getCasa() {
        return casa;
    }

    public void setCasa(Relacao casa) {
        this.casa = casa;
    }

    public List<Gol> getGols() {
        return gols;
    }

    public void setGols(List<Gol> gols) {
        this.gols = gols;
    }

    public List<Cartao> getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(List<Cartao> cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public List<Cartao> getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(List<Cartao> cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }
}
