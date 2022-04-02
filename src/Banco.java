import java.util.List;


public class Banco {
    double SomaDasContas;
    private List<ContaCorrente> ccList;
    private List<ContaPJ> pjList;
    private List<ContaSalario> csList;
    private List<ContaPoupanca> cpList;

    public Banco(double somaDasContas) {
        SomaDasContas = somaDasContas;
    }

    public double getSomaDasContas() {
        return SomaDasContas;
    }

    public void setSomaDasContas(double somaDasContas) {
        SomaDasContas = somaDasContas;
    }





}

//public double calcularSaldoTotal {



        //esse metodo deve retornar a soma do saldo de todas as contas cadastradas no Banco


    //public void calcularTransferenciaEntreContas (Conta origem, Conta destino) {
        // implementar transferencia entre contas

