package Básico.Excecao.ControleDeFluxo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UMA SIGLA: ");
        String sigla = scanner.nextLine().toUpperCase();

        switch (sigla) {
            case "P":{
                System.out.println(sigla + " = PEQUEN0");
                break;
            }
            case "M": {
                System.out.println(sigla + " = MÉDIO");
                break;
            }
            case "G": {
                System.out.println(sigla + " = GRANDE");
                break;
            }
            default:
                System.out.println("Sigla não cadastrada.");
        }

    }
}
