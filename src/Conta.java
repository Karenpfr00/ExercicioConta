public  abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double sacar;
    protected double depositar;

    public Conta(int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.sacar = sacar;
        this.depositar = depositar;
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

    public void setSaque(double sacar) {
        this.sacar = sacar;
    }

    public void setDeposito(double depositar) {
        this.depositar = depositar;
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
                ", sacar=" + sacar +
                ", depositar=" + depositar +
                '}';
    }

    public abstract double getSaldo();

    public abstract double getSacar();

    public abstract double getDepositar();

}
