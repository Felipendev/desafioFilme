package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.API.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.application.API.LocalizacaoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    private final ClimaClient climaClient;
//    private final FilmeCategoriaRepository filmeCategoriaRepository;
//    private final FilmeClient filmeClient;

    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[start] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}", localizacao);
        ClimaDTO clima = climaClient.buscaClima(localizacao);
//        FilmeCategoria categoria = filmeCategoriaRepository.buscaAtravesTemperatura(clima.getTemperatura());
//        List<FilmeResponse> filmes = filmeClient.buscaAtravesCategoria(categoria);
        log.info("[finish] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
