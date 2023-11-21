package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.API.LocalizacaoDTO;

public interface IndicadorFilmesService {
    Object buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
