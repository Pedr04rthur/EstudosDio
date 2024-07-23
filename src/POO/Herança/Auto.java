package POO.Herança;

public class Auto {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("101010");

        Moto moto = new Moto();
        moto.ligar();
    }
}
