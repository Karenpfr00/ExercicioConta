public class ContaPJ extends Conta{
    private int emissaoDeBoleto;
    private Math Match;


    public ContaPJ(int emissaoDeBoleto) {
        this.emissaoDeBoleto = emissaoDeBoleto;
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

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }
}
