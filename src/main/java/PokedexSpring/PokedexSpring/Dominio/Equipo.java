package PokedexSpring.PokedexSpring.Dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipo {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_equipo;
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Pokemon> pokemons;
    @OneToOne(targetEntity =Entrenadores.class, cascade = CascadeType.PERSIST)
    private Entrenadores entrenadores;
}
