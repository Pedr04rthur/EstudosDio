package tarefas;


import java.util.Scanner;

public class DesafioOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;




        while (continuar) {
            System.out.println("Olá! Escolha a opção desejada:");
            System.out.println("1. Despositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual valor você quer depositar? ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f \n",saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    System.out.println("Qual valor você deseja sacar? ");
                    double sacar = scanner.nextDouble();
                    if (sacar <= saldo){
                        saldo -= sacar;
                        System.out.printf("Saldo atual: %.1f \n", saldo);
                    }else {
                        System.out.println("Saldo insuficiente.");
                    }


                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f \n", saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}
