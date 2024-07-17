package Básico.Excecao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Numero: ");
        int number = scanner.nextInt();
        System.out.println("Nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("Limite de saque: ");
        double limiteSaque = scanner.nextDouble();

        Conta conta1 = new Conta(number,nome,saldo,limiteSaque);

        System.out.println();
        System.out.println("Informe a quantia para sacar: ");
        double saque = scanner.nextDouble();

        try {
            conta1.sacar(saque);
            System.out.println("Novo saldo: " + String.format("%.2f", conta1.getSaldo()));
        }
        catch(BusinessExceptions e){
            System.out.println(e.getMessage());
        }
            scanner.close();

    }
}
