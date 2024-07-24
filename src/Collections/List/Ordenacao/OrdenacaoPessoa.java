package Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }

    public void adicionaPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        //Estou duplicando a lista colocando ela na lista pessoa por idade
        List<Pessoa> pessoasporIdade = new ArrayList<>(pessoaList);
        //VOU ORDENAR AS PESSOAS POR IDADE ATRAVÉS DO COMPARABLE.
        Collections.sort(pessoasporIdade);
        return pessoasporIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordena = new OrdenacaoPessoa();
        ordena.adicionaPessoa("Nome1",20,1.61);
        ordena.adicionaPessoa("Nome1",35,1.77);
        ordena.adicionaPessoa("Nome1",19,1.85);
        ordena.adicionaPessoa("Nome1",15,1.49);
        ordena.adicionaPessoa("Nome1",20,1.70);

        System.out.println(ordena.ordernarPorIdade());
        System.out.println(ordena.ordernarPorAltura());
    }

}
