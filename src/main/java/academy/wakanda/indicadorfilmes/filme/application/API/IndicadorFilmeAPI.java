package academy.wakanda.indicadorfilmes.filme.application.API;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sugestoes")
public interface IndicadorFilmeAPI {

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FilmeResponse> indicaFilmes(@RequestParam String longitude, @RequestParam String latitude);
}
