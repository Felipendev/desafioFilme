package academy.wakanda.indicadorfilmes.filme.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Entity
public class FilmeCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idIntegrationLog", updatable = false, unique = true, nullable = false)
    @EqualsAndHashCode.Exclude
    private UUID id;
    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnum categoria;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;
}
