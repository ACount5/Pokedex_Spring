package PokedexSpring.PokedexSpring.Servicio;

import PokedexSpring.PokedexSpring.Dominio.Equipo;
import PokedexSpring.PokedexSpring.Repositorio.RepositorioEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicioEquipo {
    @Autowired
    private RepositorioEquipo repositorioEquipo;
    //Crear
    public Equipo crearEquipo(Equipo equipo) {
        return repositorioEquipo.save(equipo);
    }

    //Listar
    public List<Equipo> listarEquipos() {
        return repositorioEquipo.findAll();
    }

    //Buscar por ID
    public Equipo buscarEquipoPorId(Long id) {
        return repositorioEquipo.findById(id).orElse(null);
    }

    //Borrar por ID
    public void borrarEquipoPorId(Long id) {
        repositorioEquipo.deleteById(id);
        System.out.println("Equipo con id " + id + " borrado");
    }

    //Actualizar
    public Equipo actualizarEquipo(Long id, Equipo nuevo) {
        Equipo existente = buscarEquipoPorId(id);
        existente.setEntrenadores(nuevo.getEntrenadores());
        existente.setPokemons(nuevo.getPokemons());

        return repositorioEquipo.save(existente);
    }
}
