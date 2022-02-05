public  abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double saque;
    protected double deposito;

    public Conta(int numero, int agencia, String banco, double saldo, double saque, double deposito) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
    }

    public String getBanco() {
        return banco;
    }
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                ", saque=" + saque +
                ", deposito=" + deposito +
                '}';
    }

    public abstract double getSaldo();

    public abstract double getSaque();

    public abstract double getDeposito();

}
