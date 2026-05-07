package PokedexSpring.PokedexSpring.Repositorio;

import PokedexSpring.PokedexSpring.Dominio.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEquipo extends JpaRepository<Equipo, Long> {
}
