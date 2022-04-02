public class ContaSalario extends Conta {
    private int qtdSaque;



    public ContaSalario(int qtdSaque){
        this.qtdSaque = qtdSaque;

    }

    public double sacar (double valor){
        if (qtdSaque > 0) {
            setSaldo(getSaldo() - valor);
            qtdSaque --;
            return valor;
        }
        return 0.0;

    }
        public double depositar(double valor){
        setSaldo(getSaldo() + valor);
        return valor;
        }


    //public double getImposto(){
           //calculo do imposto

}
