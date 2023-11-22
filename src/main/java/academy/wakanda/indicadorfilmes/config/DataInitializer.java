package academy.wakanda.indicadorfilmes.config;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoriaEnum;
import academy.wakanda.indicadorfilmes.filme.infra.FilmeCategoriaStringDataJPARepository;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final FilmeCategoriaStringDataJPARepository repository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (repository.count() == 0) { // Checa se a tabela está vazia
            List<FilmeCategoria> categorias = Arrays.asList(
                    new FilmeCategoria(FilmeCategoriaEnum.ACAO, 40.1, Double.MAX_VALUE),
                    new FilmeCategoria(FilmeCategoriaEnum.COMEDIA, 36.0, 40.0),
                    new FilmeCategoria(FilmeCategoriaEnum.ANIMACAO, 20.0, 35.0),
                    new FilmeCategoria(FilmeCategoriaEnum.SUSPENSE, 0.0, 20.0),
                    new FilmeCategoria(FilmeCategoriaEnum.DOCUMENTARIO, Double.MIN_VALUE, 0.0)
            );
            repository.saveAll(categorias); // Salva a lista de categorias no banco de dados
        }
    }
}
