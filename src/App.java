import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var banco = new Banco();
        var scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Bem-vindo ao Banco");
            System.out.println("1. Criar Conta");
            System.out.println("2. Logar na Conta");
            System.out.println("3. Deslogar da Conta");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Ver Extrato");
            System.out.println("6. Depositar");
            System.out.println("7. Sacar");
            System.out.println("8. Transferir");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("CPF: ");
                    String cpf = scanner.next();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    System.out.print("Número da conta: ");
                    int numeroConta = scanner.nextInt();
                    System.out.print("Agência: ");
                    int agencia = scanner.nextInt();
                    System.out.print("Tipo de Conta: ");
                    String tipoConta = scanner.next();
                    System.out.print("Limite Cheque Especial: ");
                    double limiteChequeEspecial = scanner.nextDouble();
                    banco.criar_conta(nome, cpf, saldo, numeroConta, agencia, tipoConta, limiteChequeEspecial);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    System.out.print("Número da conta: ");
                    numeroConta = scanner.nextInt();
                    System.out.print("Agência: ");
                    agencia = scanner.nextInt();
                    banco.logar_conta(numeroConta, agencia);
                    if (banco.conta_logada != null) {
                        System.out.println("Logado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    banco.deslogar_conta();
                    break;
                case 4:
                    banco.saldo();
                    break;
                case 5:
                    banco.extrato();
                    break;
                case 6:
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    banco.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 7:
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();
                    banco.sacar(saque);
                    break;
                case 8:
                    System.out.print("Valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    System.out.print("Número da conta de destino: ");
                    int numeroContaDestino = scanner.nextInt();
                    System.out.print("Agência de destino: ");
                    int agenciaDestino = scanner.nextInt();
                    banco.transferir(valorTransferencia, numeroContaDestino, agenciaDestino);
                    System.out.println("Transferência realizada com sucesso!");
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        } while (opcao != 9);

        scanner.close();
    }

}
