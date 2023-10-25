import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void depositar(String numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta.");
        }
    }

    public void sacar(String numeroConta, double valor) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            if (conta.getSaldo() >= valor) {
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso na conta " + numeroConta);
            } else {
                System.out.println("Saldo insuficiente na conta " + numeroConta);
            }
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta.");
        }
    }

    public void transferir(String contaOrigem, String contaDestino, double valor) {
        Conta origem = encontrarConta(contaOrigem);
        Conta destino = encontrarConta(contaDestino);

        if (origem != null && destino != null) {
            if (origem.getSaldo() >= valor) {
                origem.transferir(destino, valor);
                System.out.println("Transferência realizada com sucesso de " + contaOrigem + " para " + contaDestino);
            } else {
                System.out.println("Saldo insuficiente na conta de origem " + contaOrigem);
            }
        } else {
            System.out.println("Conta de origem ou conta de destino não encontrada. Verifique os números das contas.");
        }
    }

    public double verificarSaldo(String numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            return conta.getSaldo();
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta.");
            return 0.0;
        }
    }

    public void exibirExtrato(String numeroConta) {
        Conta conta = encontrarConta(numeroConta);
        if (conta != null) {
            conta.exibirExtrato();
        } else {
            System.out.println("Conta não encontrada. Verifique o número da conta.");
        }
    }

    private Conta encontrarConta(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }
}


