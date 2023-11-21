package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.API.LocalizacaoDTO;

public interface ClimaClient {
    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
