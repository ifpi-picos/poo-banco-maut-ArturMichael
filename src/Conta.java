
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String agencia;
    private String numero;
    protected double saldo;
    private Cliente cliente;
    protected Notificacoes notificacoes;
    private List<Transacoes> transacoes;


    public Conta(String agencia, String numero, Cliente cliente, Notificacoes notificacoes) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
        this.notificacoes = notificacoes;
        this.transacoes = new ArrayList<>();

    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void transferir(Conta contaDestino, double valor);

    public void exibirExtrato() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void notificacoes(String tipo, double valor) {
        notificacoes.enviaNotificacoes(tipo, valor);
    }

    public void setNotificacoes(Notificacoes notificacoes) {
        this.notificacoes = notificacoes;
    }

    public Notificacoes getNotificacoes() {
        return notificacoes;
    }

    public List<Transacoes> getTransacoes() {
        return transacoes;
    }





    
}
