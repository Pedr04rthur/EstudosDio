package Básico.EstruturaRepeticao;

public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe",  "Arthur", "Paulo"};


        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);


        }
        //para cada interação em aluno
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
