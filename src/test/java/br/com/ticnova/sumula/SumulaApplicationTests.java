package br.com.ticnova.sumula;

import br.com.ticnova.sumula.domain.campeonato.Campeonato;
import br.com.ticnova.sumula.domain.campeonato.CampeonatoRepository;
import br.com.ticnova.sumula.domain.clube.Clube;
import br.com.ticnova.sumula.domain.clube.ClubeRepository;
import br.com.ticnova.sumula.domain.estadio.Estadio;
import br.com.ticnova.sumula.domain.estadio.EstadioRepository;
import br.com.ticnova.sumula.domain.jogador.JogadorRepository;
import br.com.ticnova.sumula.domain.sumula.*;
import com.google.common.base.Preconditions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SumulaApplication.class)
public class SumulaApplicationTests {

	@Autowired
	private ClubeRepository clubeRepository;

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    @Autowired
    private SumulaRepository sumulaRepository;
    @Autowired
    private JogadorRepository jogadorRepository;
    @Autowired
    private JogadorRelacionadoRepository jogadorRelacionadoRepository;
    @Autowired
    private RelacaoRepository relacaoRepository;

    @Autowired
    private EstadioRepository estadioRepository;

    @Test
    @Transactional
	public void contextLoads() {

        Campeonato campeonatoBrasileiro = campeonatoRepository.findOne(1L);

        Clube chapecoense = clubeRepository.getOne(1L);
        Clube atleticoMg = clubeRepository.getOne(2L);

        Estadio arenaConda = estadioRepository.getOne(1L);

        List<JogadorRelacionado> jogadoresChape = new ArrayList<>();
        jogadoresChape.add(criaRelacionado(chapecoense, 1, "T", "Danilo"));
        jogadoresChape.add(criaRelacionado(chapecoense, 2, "T", "Apodi"));
        jogadoresChape.add(criaRelacionado(chapecoense, 6, "T", "Dener"));
        jogadoresChape.add(criaRelacionado(chapecoense, 8, "T", "Gil"));
        jogadoresChape.add(criaRelacionado(chapecoense, 9, "T", "Bruno"));
        jogadoresChape.add(criaRelacionado(chapecoense, 11, "T", "Ananias"));
        jogadoresChape.add(criaRelacionado(chapecoense, 17, "T", "Elicarlos"));
        jogadoresChape.add(criaRelacionado(chapecoense, 29, "T", "Neto"));
        jogadoresChape.add(criaRelacionado(chapecoense, 34, "T", "Vilson"));
        jogadoresChape.add(criaRelacionado(chapecoense, 88, "T", "Cleber Santana"));
        jogadoresChape.add(criaRelacionado(chapecoense, 89, "T", "Tiago Luis"));
        jogadoresChape.add(criaRelacionado(chapecoense, 3, "R", "Rafael"));
        jogadoresChape.add(criaRelacionado(chapecoense, 5, "R", "Wanderson"));
        jogadoresChape.add(criaRelacionado(chapecoense, 10, "R", "Fernando"));
        jogadoresChape.add(criaRelacionado(chapecoense, 13, "R", "Silvio"));
        jogadoresChape.add(criaRelacionado(chapecoense, 21, "R", "Hyoran"));
        jogadoresChape.add(criaRelacionado(chapecoense, 23, "R", "Roger"));
        jogadoresChape.add(criaRelacionado(chapecoense, 32, "R", "Mateus"));
        jogadoresChape.add(criaRelacionado(chapecoense, 33, "R", "Odair"));
        jogadoresChape.add(criaRelacionado(chapecoense, 39, "R", "Joao"));
        jogadoresChape.add(criaRelacionado(chapecoense, 40, "R", "Nilson"));
        jogadoresChape.add(criaRelacionado(chapecoense, 45, "R", "Costa"));
        jogadoresChape.add(criaRelacionado(chapecoense, 47, "R", "Wagner"));

        List<JogadorRelacionado> jogadoresAtletico = new ArrayList<>();
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 1, "T", "Victor"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 2, "T", "Marcos Rocha"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 3, "T", "Leo Silva"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 4, "T", "Jemerson"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 5, "T", "Rafael"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 8, "T", "Leandro Donizete"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 9, "T", "Lucas Pratto"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 10, "T", "Datolo"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 16, "T", "Pedro Botelho"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 17, "T", "Guilherme"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 27, "T", "Luan"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 15, "R", "Edcarlos"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 18, "R", "Carlos"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 19, "R", "Cardenas"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 20, "R", "Giovanni"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 22, "R", "Thiago Ribeiro"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 23, "R", "Dodo"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 25, "R", "Danilo"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 26, "R", "Tiago"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 28, "R", "Josue"));
        jogadoresAtletico.add(criaRelacionado(atleticoMg, 30, "R", "Eduardo"));

        Relacao relacaoChapecoense = new Relacao();
        relacaoChapecoense.setClube(chapecoense);
        relacaoChapecoense.setJogadores(jogadoresChape);

        Relacao relacaoAtleticoMg = new Relacao();
        relacaoAtleticoMg.setClube(atleticoMg);
        relacaoAtleticoMg.setJogadores(jogadoresAtletico);

        Sumula sumula = new Sumula();
        sumula.setCampeonato(campeonatoBrasileiro);
        sumula.setCasa(relacaoChapecoense);
        sumula.setVisitante(relacaoAtleticoMg);
        sumula.setEstadio(arenaConda);

        relacaoRepository.save(relacaoAtleticoMg);
        for (JogadorRelacionado jogadorRelacionado : jogadoresAtletico) {
            jogadorRelacionado.setRelacao(relacaoAtleticoMg);
            jogadorRelacionadoRepository.save(jogadorRelacionado);
        }

        relacaoRepository.save(relacaoChapecoense);
        for (JogadorRelacionado jogadorRelacionado : jogadoresChape) {
            jogadorRelacionado.setRelacao(relacaoChapecoense);
            jogadorRelacionadoRepository.save(jogadorRelacionado);
        }

        sumulaRepository.save(sumula);

        assertNotNull(sumula.getId());

	}

    @Test
    @Transactional
    public void testLoad() {
        Sumula sumulaCarregada = sumulaRepository.getOne(1L);
        assertNotNull(sumulaCarregada);
    }


    private JogadorRelacionado criaRelacionado(Clube clube, int numero, String tipo, String apelido) {
        JogadorRelacionado rel = new JogadorRelacionado();
        rel.setJogador(Preconditions.checkNotNull(jogadorRepository.getByClubeAndApelido(clube, apelido)));
        rel.setNumero(numero);
        rel.setTipoEscalacao(tipo);
        return rel;
    }

}
