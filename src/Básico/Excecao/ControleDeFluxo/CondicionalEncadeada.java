package Básico.Excecao.ControleDeFluxo;

import java.util.Scanner;

public class CondicionalEncadeada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        if (nota >= 7){
            System.out.println("APROVADO");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("RECUPERAÇÃO");
        }
        else {
            System.out.println("REPROVADO");
        }
    }


    }

