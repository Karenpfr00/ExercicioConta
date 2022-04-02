public class ContaPoupanca extends Conta {
    private double valorPoupado;


    public ContaPoupanca(double valorPoupado ) {
        this.valorPoupado = valorPoupado;

    }

    @Override
    public double sacar(double valor) {
        System.out.println("Valor Poupado até o momento: " + valorPoupado);
        System.out.println("Sacando: " + valor);
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo atual: " + (valorPoupado-getSaldo()));
        return valor;

    }

    public double depositar(double valor) {
        System.out.println("Depositando: " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: " + (valorPoupado+getSaldo()));
        return valor;
    }


}
