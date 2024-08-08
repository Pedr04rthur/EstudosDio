package tarefas;

import java.util.Arrays;
import java.util.List;

public class DesafioStream2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2,2);
        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue) // DECLARANDO A CONVERSÃO DOS ELEMENTOS PARA ITNEIROS
                .sum();

        System.out.println(somaPares);
    }
}
