public abstract class Conta {
    private String agencia;
    private String numero;
    protected double saldo;
    private Cliente cliente;
    private Notificacoes notificacoes;

    public Conta(String agencia, String numero, Cliente cliente, int transferenciasRealizadas, Notificacoes notificacoes2) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
        this.notificacoes = notificacoes;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

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




    
}
