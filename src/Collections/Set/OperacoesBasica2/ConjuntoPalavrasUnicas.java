package Collections.Set.OperacoesBasica2;

import Collections.Set.OperacoesBasicas.ConjuntoConvidados;

//GAMBIARRA///////////
//GAMBIARRA/////////////
//GAMBIARRA////////////////
//GAMBIARRA//GAMBIARRA////////
//GAMBIARRA//GAMBIARRA//GAMBIARRA///////
//GAMBIARRA//GAMBIARRA//GAMBIARRA//GAMBIARRA
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String i : this.conjuntoSet) {
            if (i.equalsIgnoreCase(palavra)) {
                this.conjuntoSet.remove(palavra);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {

        String verifica;
        for (String i : this.conjuntoSet) {
            if (i.equals(palavra)) {
                System.out.println("Palavra existente");
                verifica = palavra;

            }
        }


    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoSet=" + conjuntoSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Pera");
        conjunto.adicionarPalavra("Uva");
        conjunto.adicionarPalavra("Maçã");
        conjunto.adicionarPalavra("Salada Mista");


        conjunto.verificarPalavra("Pera");
        System.out.println(conjunto.conjuntoSet);
    }
}
