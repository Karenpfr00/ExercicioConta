public class ContaSalario extends Conta {
    private int qtdSaque;

    public ContaSalario(int qtdSaque){
        this.qtdSaque = qtdSaque;

    }

    public double sacar (double valor){
        if (qtdSaque <3 ) {
            System.out.println("Tentando sacar " + qtdSaque);

            return valor;
        }  else {
            System.out.println("Quantidade de saque excedido"); }

            return 0.0;

    }
        public double depositar(double valor){
            System.out.println("Deposito de : " + valor);
        setSaldo(getSaldo() + valor);
            System.out.println("Saldo atual: " + getSaldo());
        return valor;
        }




    //public double getImposto(){
           //calculo do imposto

}
