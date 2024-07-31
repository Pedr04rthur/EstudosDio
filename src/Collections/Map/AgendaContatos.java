package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    //CONSTRUTOR

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }


    //MÉTODOS
    public void adicionarContato(String nome, int numero){
        agendaContatoMap.put(nome,numero);
    }


    //NÃO PRECISO PERCORRER PORQUE A CHAVE É ÚNICA
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

}
