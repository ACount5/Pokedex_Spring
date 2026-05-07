package PokedexSpring.PokedexSpring.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Entrenador")
public class Entrenadores {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_entrenador;
    @Column(nullable = false)
    private String nombre;
    private int edad;
    private String ciudad;

}
