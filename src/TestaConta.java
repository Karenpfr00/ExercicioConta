public class TestaConta {
    public static void main(String[] args) {
        System.out.println("Conta Corrente");
        ContaCorrente cc = new ContaCorrente(100);
        cc.depositar(500);
        cc.sacar(10);

        System.out.println("--------------------------");
        System.out.println("Conta Juridica");
        ContaPJ cpj = new ContaPJ(100, 20000);
        cpj.emissaoDeBoleto(10);
        cpj.depositar(1000);
        cpj.sacar(6000);
        cpj.getSaldo();

        System.out.println("--------------------");
        System.out.println(" Conta Salario");
        ContaSalario cs = new ContaSalario(4);
        cs.depositar(800);
        cs.sacar(200);
        cs.getSaldo();

        System.out.println("--------------------");
        System.out.println("Conta Poupança");
        ContaPoupanca cp = new ContaPoupanca(1000);
        cp.sacar(100);
        cp.depositar(500);



    }

}
