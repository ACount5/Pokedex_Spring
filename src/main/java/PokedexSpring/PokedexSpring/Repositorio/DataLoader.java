package PokedexSpring.PokedexSpring.Repositorio;


import PokedexSpring.PokedexSpring.Dominio.Entrenadores;
import PokedexSpring.PokedexSpring.Dominio.Equipo;
import PokedexSpring.PokedexSpring.Dominio.Gimnasios;
import PokedexSpring.PokedexSpring.Dominio.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements CommandLineRunner {
    private final RepositorioPokemon repositorioPokemon;
    private final RepositorioEquipo repositorioEquipo;
    private final RepositorioEntrenadores repositorioEntrenadores;
    private final RepositorioGimnasios repositorioGimnasios;

    public DataLoader(RepositorioPokemon repositorioPokemon, RepositorioEquipo repositorioEquipo, RepositorioEntrenadores repositorioEntrenadores, RepositorioGimnasios repositorioGimnasios) {
        this.repositorioPokemon = repositorioPokemon;
        this.repositorioEquipo  = repositorioEquipo;
        this.repositorioEntrenadores = repositorioEntrenadores;
        this.repositorioGimnasios = repositorioGimnasios;

    }

    @Override
    public void run(String... args) throws Exception {
        if (repositorioPokemon.count() == 0) {
            //Crear Entrenador
            Entrenadores amin = new Entrenadores(null,"Amin",40,"Córdoba");
            Entrenadores edu = new Entrenadores(null,"Eduardo",47,"Palma del Río");

            // Crear equipos
            Equipo equipoRojo = new Equipo();
            equipoRojo.setPokemons(new ArrayList<>());
            equipoRojo.setEntrenadores(amin);

            Equipo equipoAzul = new Equipo();
            equipoAzul.setPokemons(new ArrayList<>());
            equipoAzul.setEntrenadores(edu);

            repositorioEquipo.save(equipoRojo);
            repositorioEquipo.save(equipoAzul);

            //Crear Pokemons
            repositorioPokemon.save(new Pokemon(null,"Bulbasaur","Planta",18,equipoRojo));
            repositorioPokemon.save(new Pokemon(null,"Squirtle","Agua",15,equipoAzul));
            repositorioPokemon.save(new Pokemon(null,"Charmander","Fuego",13,equipoRojo));
            repositorioPokemon.save(new Pokemon(null,"Pikachu","Eléctrico",20,equipoAzul));

            //Crear Gimnasio
            repositorioGimnasios.save(new Gimnasios(null,"Kimé","Palma del Río","César"));
            repositorioGimnasios.save((new Gimnasios(null,"Oxygen","Córdoba","Yamine Lamal")));

            System.out.println("✅ DATOS DE PRUEBA LISTOS");
        }
    }
}
