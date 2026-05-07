package PokedexSpring.PokedexSpring.Repositorio;

import PokedexSpring.PokedexSpring.Dominio.Entrenadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEntrenadores extends JpaRepository<Entrenadores, Long> {
}
