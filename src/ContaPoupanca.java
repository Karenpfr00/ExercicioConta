public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros, double sacar, double depositar) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }


    @Override
    public double getSacar() {
        return this.saldo-this.sacar;
    }

    @Override
    public double getDepositar() {
        return this.saldo+this.depositar;
    }

    @Override
    public double getSaldo(){
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

}
