package devgabriel.CadastroDeUsuarios.Atividades;


import devgabriel.CadastroDeUsuarios.Usuarios.UsuarioModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private int nivelDificuldade;

    @OneToMany(mappedBy = "atividades") //@UmParaMuitos, uma atividade pode pussuir vários usuários
    private List<UsuarioModel> usuario;

    public AtividadesModel() {

    }

    public AtividadesModel(String descricao, int nivelDificuldade) {
        this.descricao = descricao;
        this.nivelDificuldade = nivelDificuldade;
    }

}
