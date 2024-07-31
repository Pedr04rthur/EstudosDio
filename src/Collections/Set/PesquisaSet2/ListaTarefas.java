package Collections.Set.PesquisaSet2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }


    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada");
        }

    }

    public void marcarConcluido(){

    }


    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();
        lista1.adicionarTarefa("Escovar os teeth");
        lista1.adicionarTarefa("Cochilar");
        lista1.adicionarTarefa("Academia");
        lista1.adicionarTarefa("Estudar");
        lista1.adicionarTarefa("Cozinhar");

        lista1.exibirTarefas();
    }
}

