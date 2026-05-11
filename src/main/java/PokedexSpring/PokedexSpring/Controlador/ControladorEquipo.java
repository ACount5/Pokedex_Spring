package PokedexSpring.PokedexSpring.Controlador;


import PokedexSpring.PokedexSpring.Dominio.Equipo;
import PokedexSpring.PokedexSpring.Servicio.ServicioEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipo")
public class ControladorEquipo {
    @Autowired
    private ServicioEquipo servicioEquipo;
    // Crear
    @PostMapping("/crear")
    public Equipo crear(@RequestBody Equipo equipo) {
        return servicioEquipo.crearEquipo(equipo);
    }

    // Listar
    @GetMapping("/lista")
    public List<Equipo> listar() {
        return servicioEquipo.listarEquipos();
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Equipo obtener(@PathVariable Long id) {
        return servicioEquipo.buscarEquipoPorId(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable Long id) {
        servicioEquipo.borrarEquipoPorId(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Equipo actualizar(@PathVariable Long id, @RequestBody Equipo equipo) {
        return servicioEquipo.actualizarEquipo(id, equipo);
    }
}
