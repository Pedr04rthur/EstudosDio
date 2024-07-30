package Collections.Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato>  contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet ){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(nome);
            }
        }
        return contatosPorNome;


    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
                }
            }
        return contatoAtualizado;

        }
    }
    
}

