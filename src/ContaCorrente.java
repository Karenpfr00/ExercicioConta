public class ContaCorrente extends Conta {
    private double chequeEspecial;


    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double saque, double deposito) {
        super(numero, agencia, banco, saldo, saque, deposito);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public double getSaque() {
        return this.saldo-this.saque;
    }

    @Override
    public double getDeposito() {
        return this.saldo+this.deposito;
    }

    @Override
    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }
}

