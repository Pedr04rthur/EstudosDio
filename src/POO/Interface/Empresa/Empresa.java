package POO.Interface.Empresa;

import POO.Interface.Copiadora.Copiadora;
import POO.Interface.Digitalizadora.Digitalizadora;
import POO.Interface.Impressora.Impressora;
import POO.Interface.Multificional.EquipamentoMultifucional;

public class Empresa {
    public static void main(String[] args) {
        EquipamentoMultifucional e = new EquipamentoMultifucional();
        Impressora impressora = e;
        Digitalizadora digitalizadora = e;
        Copiadora copiadora = e;

        impressora.imprimir();
    }
}
