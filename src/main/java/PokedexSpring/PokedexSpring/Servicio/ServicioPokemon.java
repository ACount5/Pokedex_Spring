package PokedexSpring.PokedexSpring.Servicio;

import PokedexSpring.PokedexSpring.Dominio.Pokemon;
import PokedexSpring.PokedexSpring.Repositorio.RepositorioPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPokemon {
    @Autowired
    RepositorioPokemon repositorioPokemon;

    //Crear
    public Pokemon crearPokemon(Pokemon pokemon) {
        return repositorioPokemon.save(pokemon);
    }

    //Listar
    public List<Pokemon> listarPokemon() {
        return repositorioPokemon.findAll();
    }

    //Buscar por ID
    public Pokemon buscarPokemonPorId(Long id) {
       return repositorioPokemon.findById(id).orElse(null);
    }

    //Borrar por ID
    public void borrarPokemonPorId(Long id) {
        repositorioPokemon.deleteById(id);
        System.out.println("Pokemon con id " + id + " borrado");
    }

    //Actualizar
    public Pokemon actualizarPokemon(Long id, Pokemon nuevo) {
        Pokemon existente = buscarPokemonPorId(id);
        existente.setNombre(nuevo.getNombre());
        existente.setTipo(nuevo.getTipo());
        existente.setNivel(nuevo.getNivel());

        return repositorioPokemon.save(existente);
    }
}
