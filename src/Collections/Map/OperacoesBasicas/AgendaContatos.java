package Collections.Map.OperacoesBasicas;

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


    public static void main(String[] args) {
        AgendaContatos agenda1 = new AgendaContatos();

        agenda1.adicionarContato("Vitoria",839884231);
        agenda1.adicionarContato("Poliana",839676767);
        agenda1.adicionarContato("Noemi",834555667);
        agenda1.adicionarContato("Taina",834343434);
        agenda1.removerContato("Vitoria");
        agenda1.exibirContato();
        System.out.println("SEARCH: " + agenda1.pesquisarNome("Taina"));
    }
}
