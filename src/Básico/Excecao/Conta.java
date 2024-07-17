package Básico.Excecao;

public class Conta {
    private int numberAccout = 8080;
    private String titular = "BillyBob";
    private double saldo = 200.00;
    private double limiteSaque = 300;



    public Conta(){
    }

    public Conta(int numberAccout, String titular, double saldo, double limiteSaque) {
        this.numberAccout = numberAccout;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }



    public void deposit(double value) {
        saldo += value;
    }

    public void sacar(double value){
        validaSaque(value);
        saldo -= value;
    }
    public int getNumberAccout() {
        return numberAccout;
    }

    public void setNumberAccout(int numberAccout) {
        this.numberAccout = numberAccout;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    private void validaSaque(double valor){
        if (valor > getLimiteSaque()) {
            throw new BusinessExceptions("A quantia excede o limitE");
        }
        if(valor > getSaldo()){
            throw new BusinessExceptions("SALDO INSUFICIENTE");

        }
    }
}
