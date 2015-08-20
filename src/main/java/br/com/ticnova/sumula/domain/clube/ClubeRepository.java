package br.com.ticnova.sumula.domain.clube;

import br.com.ticnova.sumula.domain.clube.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de Times
 */
public interface ClubeRepository extends JpaRepository<Clube, Long> {
}
