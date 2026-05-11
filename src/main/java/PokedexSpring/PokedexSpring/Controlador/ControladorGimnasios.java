package PokedexSpring.PokedexSpring.Controlador;



import PokedexSpring.PokedexSpring.Dominio.Gimnasios;
import PokedexSpring.PokedexSpring.Servicio.ServicioGimnasios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gimnasio")
public class ControladorGimnasios {
    @Autowired
    private ServicioGimnasios servicioGimnasios;
    // Crear
    @PostMapping("/crear")
    public Gimnasios crear(@RequestBody Gimnasios gimnasio) {
        return servicioGimnasios.crearGimnasio(gimnasio);
    }

    // Listar
    @GetMapping("/lista")
    public List<Gimnasios> listar() {
        return servicioGimnasios.listarGimnasios();
    }

    // Buscar por id
    @GetMapping("/buscar/{id}")
    public Gimnasios obtener(@PathVariable int id) {
        return servicioGimnasios.buscarGimnasioPorId(id);
    }

    // Borrar por id
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id) {
        servicioGimnasios.borrarGimnasioPorId(id);
    }

    // Actualizar
    @PutMapping("actualizar/{id}")
    public Gimnasios actualizar(@PathVariable int id, @RequestBody Gimnasios gimnasio) {
        return servicioGimnasios.actualizarGimnasio(id, gimnasio);
    }
}
