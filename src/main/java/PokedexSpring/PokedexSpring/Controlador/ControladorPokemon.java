package PokedexSpring.PokedexSpring.Controlador;


import PokedexSpring.PokedexSpring.Dominio.Pokemon;
import PokedexSpring.PokedexSpring.Repositorio.RepositorioPokemon;
import PokedexSpring.PokedexSpring.Servicio.ServicioPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class ControladorPokemon {
    @Autowired
    private RepositorioPokemon repositorioPokemon;
    @Autowired
    private ServicioPokemon servicioPokemon;

    // Crear
    @PostMapping("/crear")
    public Pokemon crear(@RequestBody Pokemon pokemon) {
        return servicioPokemon.crearPokemon(pokemon);
    }

    // Listar
    @GetMapping("/lista")
    public List<Pokemon> listar() {
        return servicioPokemon.listarPokemon();
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Pokemon obtener(@PathVariable Long id) {
        return servicioPokemon.buscarPokemonPorId(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioPokemon.borrarPokemonPorId(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Pokemon actualizar(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        return servicioPokemon.actualizarPokemon(id, pokemon);
    }
}
