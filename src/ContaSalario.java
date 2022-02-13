public class ContaSalario extends Conta {
    private int qtdSaque;



    public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, int qtdSaque, double depositar){
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.qtdSaque = qtdSaque;

    }

    public void getSaldo(double saldo) {
            this.saldo = saldo;
        }

    public int getQtdSaque() {
        return qtdSaque;
    }

    @Override
    public double getSacar() {
       return this.saldo-this.sacar;
    }

    @Override
    public double getDepositar() {
        return this.depositar;
    }
    @Override
    public double getSaldo() {
        return this.saldo;
    }


}
