public class ContaPJ extends Conta{
    private int emissaoDeBoleto;
    private Math Match;
    private double capitalInvestido;

    public ContaPJ(int emissaoDeBoleto, double capitalInvestido) {
        this.emissaoDeBoleto = emissaoDeBoleto;
        this.capitalInvestido = capitalInvestido;
    }

    public double getCapitalInvestido() {
        return capitalInvestido;
    }

    public void setCapitalInvestido(double capitalInvestido) {
        this.capitalInvestido = capitalInvestido;
    }

    public int getEmissaoDeBoleto(int i) {
        return emissaoDeBoleto;
    }

    public void setEmissaoDeBoleto(int emissaoDeBoleto) {
        this.emissaoDeBoleto = emissaoDeBoleto;
    }

    public int emissaoDeBoleto(int quantidade) {
        System.out.println("Tentando emitir: " + quantidade + " boletos");
        if (quantidade <= emissaoDeBoleto) {
            setEmissaoDeBoleto(emissaoDeBoleto - quantidade);
            System.out.println("Quantidade de boletos disponíveis " + emissaoDeBoleto);

            return quantidade;
        } else{
             System.out.println("Sem emissão de boleto disponível");
        } return 0;

    }

    private int getEmissaoDeBoleto(){
        int qtdEmissao = 100;
        if (emissaoDeBoleto < 0)
            return qtdEmissao - Match.abs(emissaoDeBoleto);
        else
            return qtdEmissao;
    }

    public double sacar(double valor) {
        System.out.println("Sacando: " + valor);
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo atual: " + (capitalInvestido-getSaldo()));
        return valor;

    }

    public double depositar(double valor){
        System.out.println("Deposito de : " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: " + (capitalInvestido+getSaldo()));
        return valor;

    }
}
