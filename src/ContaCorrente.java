public class ContaCorrente extends Conta {
    private double chequeEspecial;


    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double sacar, double depositar) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
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
        return this.chequeEspecial + this.saldo;
    }
}

