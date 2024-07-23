package POO.Interface.Multificional;

import POO.Interface.Copiadora.Copiadora;
import POO.Interface.Digitalizadora.Digitalizadora;
import POO.Interface.Impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO --> MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO --> MULTIFUNCIONAL");
    }
}
