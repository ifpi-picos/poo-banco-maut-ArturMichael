import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Banco banco = new Banco();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu da Aplicação Bancária:");
            System.out.println("1. Abrir Conta Corrente");
            System.out.println("2. Abrir Conta Poupança");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Verificar Saldo");
            System.out.println("7. Exibir Extrato");
            System.out.println("8. Sair");
            System.out.print("Selecione uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o numero da conta: ");
                    String nomeCliente = scanner.next();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCliente = scanner.next();
                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, null, null);
                    ContaCorrente contaCorrente = new ContaCorrente(nomeCliente, nomeCliente, cliente, 1000, escolha, null);
                    banco.adicionarConta(contaCorrente);
                    break;
                case 2:
                    System.out.print("Digite o numero da conta: ");
                    nomeCliente = scanner.next();
                    System.out.print("Digite o CPF do cliente: ");
                    cpfCliente = scanner.next();
                    cliente = new Cliente(nomeCliente, cpfCliente, null, null);
                    ContaPoupanca contaPoupanca = new ContaPoupanca(nomeCliente, nomeCliente, cliente, 0.1, 0.05, 0.02, escolha, null);
                    banco.adicionarConta(contaPoupanca);
                    break;
                case 3:
                    System.out.print("Digite o número da conta: ");
                    String numeroConta = scanner.next();
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(numeroConta, valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o número da conta: ");
                    numeroConta = scanner.next();
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(numeroConta, valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o número da conta de origem: ");
                    String contaOrigem = scanner.next();
                    System.out.print("Digite o número da conta de destino: ");
                    String contaDestino = scanner.next();
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    banco.transferir(contaOrigem, contaDestino, valorTransferencia);
                    break;
                case 6:
                    System.out.print("Digite o número da conta: ");
                    numeroConta = scanner.next();
                    double saldo = banco.verificarSaldo(numeroConta);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 7:
                    System.out.print("Digite o número da conta: ");
                    numeroConta = scanner.next();
                    banco.exibirExtrato(numeroConta);
                    break;
                case 8:
                    System.out.println("Encerrando a aplicação.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }
}
