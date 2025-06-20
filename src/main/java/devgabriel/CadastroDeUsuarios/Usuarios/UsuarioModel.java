package devgabriel.CadastroDeUsuarios.Usuarios;

//JPA = JAVA PERSISTENCE API
import devgabriel.CadastroDeUsuarios.Atividades.AtividadesModel;
import jakarta.persistence.*;
import java.util.List;

@Entity // Anotation transforma essa classe em uma entidade do database
@Table(name = "tb_cadastro_usuarios") // Anotation nomeia a tabela que será criada no database
public class UsuarioModel {

    @Id //Anotation indica o campo que será o id da tabela no database
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Anotation gera o id sequencial
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne //@MuitosParaUm, um usuário tem uma única atividade
    @JoinColumn(name = "atividades_id")  //Cria a Foreing Key
    private AtividadesModel atividades;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
