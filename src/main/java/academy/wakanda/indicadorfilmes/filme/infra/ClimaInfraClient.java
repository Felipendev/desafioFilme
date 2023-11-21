package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.API.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.application.service.ClimaClient;
import academy.wakanda.indicadorfilmes.filme.application.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient ;
    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.units}")
    private String units;

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info("[start] ClimaInfraClient - buscaClima");
        log.info("[localizacao] {}", localizacao);
        ClimaDTO climaDTO = climaFeignClient.buscaClima(localizacao.getLatitude(), localizacao.getLongitude(), apiKey, units);
        log.info("[climaDTO] {}", climaDTO);
        log.info("[finish] ClimaInfraClient - buscaClima");
        return climaDTO;
    }
}
