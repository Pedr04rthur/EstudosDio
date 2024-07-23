package Collections.List.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;


    //Sempre que eu criar um objeto do tipo Lista,sempre vou ter um atributo tarefa lista com um array vazio esperando
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        //Esse medo eu vou adicionar a tarefa que eu quero aqui dentro
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Lista criada
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //Vou percorrer a lista e verificar qual tarefa eu quero remover,
        // no for, se a descricao for igual a que eu passei nesse parametro, ele vai adicionar na variável
        // que logo em seguida será adicionado na lista
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //Removendo todos que foram selecionados no for
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        //retornando o tamanho da lista
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listTarefa = new ListaTarefa();

        listTarefa.adicionarTarefa("Limpar a casa");
        listTarefa.adicionarTarefa("Academia");
        listTarefa.adicionarTarefa("Estudar");


        System.out.println("total de elementos: " + listTarefa.obterNumeroTotalTarefas());
//        listTarefa.removerTarefa("Limpar a casa")
        listTarefa.obterDescricoesTarefas();
    }
}
