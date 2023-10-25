public class ContaPoupanca extends Conta{
    private double taxaSaque;
    private double taxaTransferencia;
    private double rendimento;

    public ContaPoupanca(String agencia, String numero, Cliente cliente, Notificacoes notificacoes) {
        super(agencia, numero, cliente, notificacoes);
        this.taxaSaque = 0.05;
        this.taxaTransferencia = 0.1;
        this.rendimento = 0.1;
    }
    @Override
    public void sacar(double valor) {
        double taxa = valor * taxaSaque;
        if (valor < saldo) {
            saldo -= valor + taxa;
            notificacoes.enviaNotificacoes("saque", valor);
            getTransacoes().add(new Transacoes("saque", valor));
        } else {
           System.out.println("Saldo insuficiente"); 
        }
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        double taxa = valor * taxaTransferencia;
        if (valor + taxa <= saldo) {
            saldo -= valor + taxa;
            contaDestino.saldo += valor;
            notificacoes.enviaNotificacoes("transferencia", valor);
            getTransacoes().add(new Transacoes("transferencia", valor));
            contaDestino.getTransacoes().add(new Transacoes("recibo transferencia", valor));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor + (valor * 0.1);

        if (notificacoes != null) {
            notificacoes.enviaNotificacoes("deposito" , valor);
            getTransacoes().add(new Transacoes("deposito", valor));
        }else {
            System.out.println("Nenhuma notificacao");
        }
    }
    

    

    
}