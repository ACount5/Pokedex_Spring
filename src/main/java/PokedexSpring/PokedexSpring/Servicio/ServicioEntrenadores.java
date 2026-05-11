package PokedexSpring.PokedexSpring.Servicio;

import PokedexSpring.PokedexSpring.Dominio.Entrenadores;
import PokedexSpring.PokedexSpring.Repositorio.RepositorioEntrenadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEntrenadores {
    @Autowired
    private RepositorioEntrenadores repositorioEntrenadores;

    //Crear
    public Entrenadores crearEntrenador(Entrenadores entrenador) {
        return repositorioEntrenadores.save(entrenador);
    }

    //Listar
    public List<Entrenadores> listarEntrenadores() {
        return repositorioEntrenadores.findAll();
    }

    //Buscar por ID
    public Entrenadores buscarEntrenadorPorId(Long id) {
        return repositorioEntrenadores.findById(id).orElse(null);
    }

    //Borrar por ID
    public void borrarEntrenadorPorId(Long id) {
        repositorioEntrenadores.deleteById(id);
        System.out.println("Entrenador con id " + id + " borrado");
    }

    //Actualizar
    public Entrenadores actualizarEntrenador(Long id, Entrenadores nuevo) {
        Entrenadores existente = buscarEntrenadorPorId(id);
        existente.setNombre(nuevo.getNombre());
        existente.setEdad(nuevo.getEdad());
        existente.setCiudad(nuevo.getCiudad());

        return repositorioEntrenadores.save(existente);
    }
}
