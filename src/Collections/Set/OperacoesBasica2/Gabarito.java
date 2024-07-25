package Collections.Set.OperacoesBasica2;

import java.util.HashSet;
import java.util.Set;

public class Gabarito {

    private Set<String> palavrasUnicasSet;

    public Gabarito() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicasSet.add(palavra);


    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não econtrada.");
            }
        } else {
            System.out.println("Está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavras(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("Está vazia!");
        }
    }

    public static void main(String[] args) {
        Gabarito novoconjunto = new Gabarito();

        novoconjunto.adicionarPalavra("Tesoura");
        novoconjunto.adicionarPalavra("Trinta");
        novoconjunto.adicionarPalavra("Teto");
        novoconjunto.adicionarPalavra("Tatu");
        novoconjunto.removerPalavra("Tesoura");
        novoconjunto.exibirPalavras();
        System.out.println(novoconjunto.verificarPalavra("Tatu"));
        
    }
}
