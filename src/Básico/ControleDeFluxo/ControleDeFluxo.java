package Básico.ControleDeFluxo;

public class ControleDeFluxo {

    //Vamos criar um controle de fluxo com um caia eletrônico
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

        }
        System.out.println(saldo);
    }
}
