package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FilmeCategoriaStringDataJPARepository extends JpaRepository<FilmeCategoria, UUID> {
    List<FilmeCategoria> findByTemperaturaMinimaLessThanEqualAndTemperaturaMaximaGreaterThanEqual(Double temperaturaMax, Double temperaturaMin);
}
