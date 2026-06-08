import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente;
        String conta = "Corrente";
        int opcao = 0;
        double saldo = 0.0;
        double valor = 0.0;

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("--------------------------------------------");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("********************************************");
        System.out.println("Nome:                      " + nomeCliente);
        System.out.println("Conta:                     " + conta);
        System.out.println("Saldo:                     " + saldo);
        System.out.println("--------------------------------------------");

        while (opcao != 4) {
            System.out.println("""
                    Escolha uma opção:
                    1 - Consultar saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consultar saldo: ");
                    break;
                case 2:
                    System.out.println("Você escolheu a opçao 2");
                    break;
                case 3:
                    System.out.println("Você escolheu a opçao 3 ");
                    break;
                case 4:
                    System.out.println("Você saiu");
                    break;
                default:
                    System.out.println("Opção invalida, escolha novamente entre as opções disponiveis");
            }

            if (opcao == 1) {
                System.out.println("Seu saldo atual é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor para depositar: ");
                valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Deposito efetuado com sucesso! Seu saldo atual é de: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Digite o valor para o saque:" + "          SALDO ATUAL: " + saldo);
                valor = scanner.nextDouble();
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atual: " + saldo);
                } else {
                    System.out.println("Seu saldo não é suficiente para esse valor de saque");
                    System.out.println("Seu saldo atual é de: " + saldo);
                }

            }

        }

    }
}