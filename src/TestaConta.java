public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        cc.depositar(500);
        cc.sacar(10);

        System.out.println("--------------------------");
        ContaPJ cpj = new ContaPJ(100);
        cpj.emissaoDeBoleto(10);

        System.out.println("--------------------");
        ContaSalario cs = new ContaSalario(3);
        cs.depositar(800);
        cs.getSaldo();

        System.out.println("Épossivel sacar" );
    }

}
