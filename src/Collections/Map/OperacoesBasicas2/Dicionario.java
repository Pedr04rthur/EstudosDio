package Collections.Map.OperacoesBasicas2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra,String descricao){
        dicionario.put(palavra,descricao);
    }

    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public String pesquisarPalavra(String palavra){
        String palavraPesquisada = dicionario.get(palavra);
        return palavraPesquisada;
    }

    public void exibirPalavra(){
        System.out.println(dicionario);
    }

    public static void main(String[] args) {
        Dicionario dicionario1 = new Dicionario();
        dicionario1.adicionarPalavra("Arthur","forte e corajoso");
        dicionario1.adicionarPalavra("Panela","Objeto de metal para geralmente fazer comida");
        dicionario1.adicionarPalavra("Pedra","Elemento duro e estático que se encontra na natureza");
        dicionario1.adicionarPalavra("Significa","define a definição de alguma coisa ou pessoa");
        dicionario1.exibirPalavra();
        System.out.println(dicionario1.pesquisarPalavra("Arthur"));
        dicionario1.removerPalavra("Pedra");
        dicionario1.removerPalavra("Arthur");
        dicionario1.removerPalavra("Panela");
        dicionario1.exibirPalavra();
    }

}
