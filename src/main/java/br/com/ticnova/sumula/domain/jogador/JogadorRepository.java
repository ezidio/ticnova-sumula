package br.com.ticnova.sumula.domain.jogador;

import br.com.ticnova.sumula.domain.clube.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repositorio de Campeonatos
 */
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    List<Jogador> findByClube(Clube clube);

    Jogador getByClubeAndApelido(Clube clube, String apelido);

}
