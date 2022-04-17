abstract public class Conta {
    private double sacar;
    private double depositar;
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract double sacar(double valor);
    public abstract double depositar(double valor);

}