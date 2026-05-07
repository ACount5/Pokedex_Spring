package PokedexSpring.PokedexSpring.Dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Gimnasio")
public class Gimnasios {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_gimnasio;
    @Column(nullable = false, length = 25)
    private String nombre;
    private String ciudad;
    private String lider;
}
