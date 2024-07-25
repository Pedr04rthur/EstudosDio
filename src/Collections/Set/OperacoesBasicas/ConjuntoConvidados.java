package Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidado() {
        return convidadoSet.size();

    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.adicionarConvidado("Pedro",12345);
        convidados.exibirConvidados();
    }
}
