public class ContaSalario extends Conta {
    private int qtdSaque;



    public ContaSalario(int numero, int agencia, String banco, double saldo, double saque, int qtdSaque, double deposito){
        super(numero, agencia, banco, saldo, saque, deposito);
        this.qtdSaque = qtdSaque;

    }

    public int getQtdSaque() {
        return qtdSaque;
    }

    public void setQtdSaque(int qtdSaque) {
        this.qtdSaque = qtdSaque;
    }

    @Override
    public double getSaque() {
        return 0;
    }

    @Override
    public double getDeposito() {
        return 0;
    }


    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "qtdSaque=" + qtdSaque +
                '}';
    }

}
