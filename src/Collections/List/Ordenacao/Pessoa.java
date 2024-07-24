package Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {


    //atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    //métodos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override

    //Como idade é um inteiro, podemos usar um método do integer que nos permite usar o método compare
    public int compareTo(Pessoa p) {
        //Pego a idade da classe e comparo com a idade que passei no objeto p
        return Integer.compare(idade, p.getIdade());
    }


}
