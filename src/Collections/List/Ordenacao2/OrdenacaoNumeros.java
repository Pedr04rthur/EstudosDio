package Collections.List.Ordenacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class OrdenacaoNumeros{
    List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
        this.inteirosList.add(numero);
    }

    public void ordernarAscendente(){
        Collections.sort(inteirosList);
    }

    public void ordernarDescendente(){
        Collections.sort(inteirosList,Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return inteirosList.toString();
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordena = new OrdenacaoNumeros();
        ordena.adicionaNumero(3);
        ordena.adicionaNumero(44);
        ordena.adicionaNumero(8);
        ordena.adicionaNumero(7);
        ordena.adicionaNumero(1);

        ordena.ordernarAscendente();
//        ordena.ordernarDescendente();
        System.out.println(ordena.inteirosList);
    }
}