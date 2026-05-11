package PokedexSpring.PokedexSpring.Controlador;


import PokedexSpring.PokedexSpring.Dominio.Entrenadores;
import PokedexSpring.PokedexSpring.Servicio.ServicioEntrenadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenador")
public class ControladorEntrenadores {
    @Autowired
    private ServicioEntrenadores servicioEntrenadores;
    // Crear
    @PostMapping("/crear")
    public Entrenadores crear(@RequestBody Entrenadores entrenador) {
        return servicioEntrenadores.crearEntrenador(entrenador);
    }

    // Listar
    @GetMapping("/lista")
    public List<Entrenadores> listar() {
        return servicioEntrenadores.listarEntrenadores();
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Entrenadores obtener(@PathVariable Long id) {
        return servicioEntrenadores.buscarEntrenadorPorId(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioEntrenadores.borrarEntrenadorPorId(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Entrenadores actualizar(@PathVariable Long id, @RequestBody Entrenadores entrenador) {
        return servicioEntrenadores.actualizarEntrenador(id,entrenador);
    }
}
