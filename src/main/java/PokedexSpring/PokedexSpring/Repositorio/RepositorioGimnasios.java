package PokedexSpring.PokedexSpring.Repositorio;

import PokedexSpring.PokedexSpring.Dominio.Gimnasios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioGimnasios extends JpaRepository<Gimnasios, Integer> {
}
