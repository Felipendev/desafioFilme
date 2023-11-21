package academy.wakanda.indicadorfilmes.filme.application.API;

import academy.wakanda.indicadorfilmes.filme.application.service.IndicadorFilmesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmeController implements IndicadorFilmeAPI {
    private final IndicadorFilmesService indicadorFilmesService;

    @Override
    public List<FilmeResponse> indicaFilmes(String longitude, String latitude) {
        log.info("[start] IndicadorFilmeController - indicaFilmes");
        log.info("[longitude] {} - [latitude] {} ", longitude, latitude);
        var localizacao = LocalizacaoDTO.builder()
                .longitude(longitude)
                .latitude(latitude)
                .build();
        var filmes = indicadorFilmesService.buscaIndicacoesFilmes(localizacao);
        log.info("[finish] IndicadorFilmeController - indicaFilmes");
        return null;

    }
}
