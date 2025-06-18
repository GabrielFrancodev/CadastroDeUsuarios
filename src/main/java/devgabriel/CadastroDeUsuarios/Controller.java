package devgabriel.CadastroDeUsuarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/bemvindo") /*rota que acessa o localhost:8080/bemvindo*/
    public String bemVindo(){
        return "Primeira mensagem transmitida nessa rota";
    }
}
