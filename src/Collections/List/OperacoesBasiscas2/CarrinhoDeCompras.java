package Collections.List.OperacoesBasiscas2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemsCarrinho;

    public CarrinhoDeCompras(){
        //iniciando meu carrinho vazio sem items
        this.itemsCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemsCarrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        //Primeiro criarei uma lista para nela ser jogada os items que eu quero remover
        List<Item> itemsRemover = new ArrayList<>();
        //feito isso, usarei o for para percorrer a lista DE ITEMS no carrinho e encontrar o item que eu quero pelo nome
        for(Item i: itemsCarrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                //após o item ser encontrado, adiciono ele "i" na lista itemsRemover
                itemsRemover.add(i);
            }
        }
        //Agora posso usar o método "remove" para remover todos que eu coloquei na lista de remover
        itemsCarrinho.removeAll(itemsRemover);
    }
    public double calcularValorTotal(){
        double total = 0;
        for(Item i: itemsCarrinho){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItems(){
        System.out.println(itemsCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        carrinho1.adicionarItem("Macarrão",2.9,2);
        carrinho1.adicionarItem("Cebola",0.80,1);
        carrinho1.adicionarItem("Tomate",0.75,3);
        carrinho1.adicionarItem("Carne",23.55,1);
        carrinho1.removerItem("Carne");
        carrinho1.exibirItems();
        System.out.println(carrinho1.calcularValorTotal());
    }

}
