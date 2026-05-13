package PokedexSpring.PokedexSpring.Dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="BD_Pokemons")
public class Pokemon {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_pokemon;
    private String nombre;
    @Column(nullable = false, length = 25)
    @NotBlank(message = "El tipo no puede estar vacío.")
    private String tipo;
    private int nivel;
    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

}
