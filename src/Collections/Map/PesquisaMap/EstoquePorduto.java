package Collections.Map.PesquisaMap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EstoquePorduto {
    private Map<Long,Produto> estoqueMap;

    public EstoquePorduto() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco,int quantidade ){
        estoqueMap.put(cod, new Produto(nome,preco,quantidade));

    }

    public void exibirPordutos(){
        System.out.println(estoqueMap);
    }

    public double valorTotalEstoque(){
        double valorEstoque = 0;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                valorEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorEstoque;
    }

    public Produto obterMaiorPreco(){
        Produto produtoMaisCaro = null;
        double verificaPorduto = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()){
            if(p.getPreco() > verificaPorduto){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoquePorduto estoque1 = new EstoquePorduto();
        estoque1.adicionarProduto(10010101L,"Leite",5.80,30);
        estoque1.adicionarProduto(101010333L,"Leite",5.80,30);
        estoque1.adicionarProduto(292827262L,"Leite",5.80,30);

        estoque1.exibirPordutos();
        System.out.println(estoque1.valorTotalEstoque());
    }

}
