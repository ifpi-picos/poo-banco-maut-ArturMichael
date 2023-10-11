import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String numeroAgencia;
    private String numeroConta;
    private  double Saldo;
    private List<String>extrato;
    

    public Conta(String numeroAgencia, String numeroConta, double Saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.Saldo = 0.0;
        this.extrato = new ArrayList<>();
        
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor >= Saldo) {
            System.out.println("saque de " + valor + "realizado com sucesso");
        } else {
            System.out.println("saque invalido");
        }
    }

    public void transferir(double valor) {
        if (valor > 0 && valor >= Saldo ) {
            System.out.println("tranferencia de " + valor + " realizado com sucesso");
        } else {
            System.out.println("transferencia invalida");
        }
    }

    public void exibirExtrato() {
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }

    public double getSaldo() {
      return Saldo;
    }

    public String getnumeroConta() {
        return numeroConta;
    }

    public String getnumeroAgencia() {
        return numeroAgencia;
    }

}
