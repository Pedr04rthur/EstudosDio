package Collections.List.PesquisaLista2;

import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
    private List<Integer> numeros;


    //Construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    //Métodos
    public void adicionaNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int numero : this.numeros){
            soma += numero;
        }
        return soma;
    }

    public int econtrarMaiorNumero(){
        if(this.numeros.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        int maiorNumero = this.numeros.get(0);
        for(int numero : this.numeros){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        if(this.numeros.isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        int menorNumero = this.numeros.get(0);
        for(int numero : this.numeros){
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return new ArrayList<>(this.numeros);
    }


    public static void main(String[] args) {
        SomaNumeros numeros1 = new SomaNumeros();
        numeros1.adicionaNumero(19);
        numeros1.adicionaNumero(90);
        numeros1.adicionaNumero(22);
        numeros1.adicionaNumero(13);
        numeros1.adicionaNumero(10);
        numeros1.adicionaNumero(5);

        System.out.println(numeros1.exibirNumeros());
        System.out.println(numeros1.calcularSoma());
        System.out.println(numeros1.econtrarMaiorNumero());
        System.out.println(numeros1.encontrarMenorNumero());
    }

}
