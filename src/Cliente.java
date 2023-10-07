import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereço;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, String dataNascimento, String endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.contas = new ArrayList<>();
    }
}
