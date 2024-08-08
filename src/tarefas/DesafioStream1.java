package tarefas;

import java.util.Arrays;
import java.util.List;

public class DesafioStream1{
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,4,7,9,2,3,4);
        numeros.stream()
                .sorted() //MÉTODO PARA ORDENAR
                .forEach(System.out::println);
    }
}
