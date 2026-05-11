package PokedexSpring.PokedexSpring.Servicio;

import PokedexSpring.PokedexSpring.Dominio.Gimnasios;
import PokedexSpring.PokedexSpring.Repositorio.RepositorioGimnasios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioGimnasios {
    @Autowired
    RepositorioGimnasios repositorioGimnasios;
    //Crear
    public Gimnasios crearGimnasio(Gimnasios gimnasio) {
        return repositorioGimnasios.save(gimnasio);
    }

    //Listar
    public List<Gimnasios> listarGimnasios() {
        return repositorioGimnasios.findAll();
    }

    //Buscar por ID
    public Gimnasios buscarGimnasioPorId(int id) {
        return repositorioGimnasios.findById(id).orElse(null);
    }

    //Borrar por ID
    public void borrarGimnasioPorId(int id) {
        repositorioGimnasios.deleteById(id);
        System.out.println("Gimnasio con id " + id + " borrado");
    }

    //Actualizar
    public Gimnasios actualizarGimnasio(int id, Gimnasios nuevo) {
        Gimnasios existente = buscarGimnasioPorId(id);
        existente.setNombre(nuevo.getNombre());
        existente.setCiudad(nuevo.getCiudad());
        existente.setLider(nuevo.getLider());

        return repositorioGimnasios.save(existente);
    }
}
