public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciasRealizadas;

    public ContaCorrente(String agencia, String numero, Cliente cliente, Notificacoes notificacoes) {
        super(agencia, numero, cliente, notificacoes);
        this.chequeEspecial = 1000;
        this.transferenciasRealizadas = 0;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= saldo) {
            if(transferenciasRealizadas >2){
            this.saldo -= valor+(valor *0.1);
            contaDestino.saldo +=valor;
            notificacoes.enviaNotificacoes("transferencia", valor);
            getTransacoes().add(new Transacoes("trasferencia", valor));
            contaDestino.getTransacoes().add(new Transacoes("recibo transferencia", valor));
            transferenciasRealizadas++;
        } else {
            this.saldo -= valor;
            contaDestino.saldo +=valor;
            notificacoes.enviaNotificacoes("transferencia", valor);
            getTransacoes().add(new Transacoes("trasferencia", valor));
            contaDestino.getTransacoes().add(new Transacoes("recibo transferencia", valor));
            transferenciasRealizadas++;
        }
    }

        if (notificacoes != null) {
            notificacoes.enviaNotificacoes("deposito" , valor);
        }else {
            System.out.println("Nenhuma notificacao");
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public int getTransferenciasRealizadas() {
        return transferenciasRealizadas;
    }

    public void setTransferenciasRealizadas(int transferenciasRealizadas) {
        this.transferenciasRealizadas = transferenciasRealizadas;
    }

    public void notificacoes() {
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            this.saldo -= valor;
            getTransacoes().add(new Transacoes("saque", valor));
            notificacoes.enviaNotificacoes("deposito" , valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

        if (notificacoes != null) {
            notificacoes.enviaNotificacoes("deposito" , valor);
        }else {
            System.out.println("Nenhuma notificacao");
        }
    }

    
}
