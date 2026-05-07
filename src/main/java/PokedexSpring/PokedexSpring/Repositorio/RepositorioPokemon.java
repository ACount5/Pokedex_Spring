package PokedexSpring.PokedexSpring.Repositorio;

import PokedexSpring.PokedexSpring.Dominio.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPokemon extends JpaRepository<Pokemon, Long> {
}
