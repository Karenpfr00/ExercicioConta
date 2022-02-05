public class ContaSalario extends Conta {
    private int qtdSaque;



    public ContaSalario(int numero, int agencia, String banco, double saldo, double saque, int qtdSaque, double deposito){
        super(numero, agencia, banco, saldo, saque, deposito);
        this.qtdSaque = qtdSaque;

    }

    public void getSaldo(double saldo) {
            this.saldo = saldo;
        }

    @Override
    public double getSaque() {
       return this.saldo-this.saque;
    }

    @Override
    public double getDeposito() {
        return this.deposito;
    }
    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "qtdSaque=" + qtdSaque +
                '}';
    }
}
