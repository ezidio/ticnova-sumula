package br.com.ticnova.sumula.domain.campeonato;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de Campeonatos
 */
public interface CampeonatoRepository extends JpaRepository<Campeonato, Long> {
}
