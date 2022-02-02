public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros, double saque, double deposito) {
        super(numero, agencia, banco, saldo, saque, deposito);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public double getSaque() {
        return this.saldo-this.saque;
    }

    @Override
    public double getDeposito() {
        return this.saldo+this.deposito;
    }

    public double getSaldo(){
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

}
