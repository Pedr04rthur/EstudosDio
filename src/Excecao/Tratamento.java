package Excecao;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Tratamento {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.println("Olá, digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Agora, digite sua idade: ");
            int idade = scanner.nextInt();


            System.out.println("Qual a sua altura? ");
            double altura = scanner.nextDouble();


            System.out.println("CONFIRA SEUS DADOS");
//        System.out.println(nome + " " + idade + " " + altura);

            String[] dados = new String[3];
            dados[0] = nome;
            dados[1] = String.valueOf(idade);
            dados[2] = String.valueOf(altura);

            System.out.println("Confira seus dados: ");
            for (String elemento : dados) {
                System.out.println(elemento);
            }
        }catch(InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }



    }
}
