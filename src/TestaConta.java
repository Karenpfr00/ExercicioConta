import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    List<Conta> contaList = Arrays.asList(cc, cp, cpj, cs);

            for(Conta conta:contaList) {
                System.out.println(conta);
            }

            Cliente cli1 = new Cliente("Karen", true, "1234", 10);
            Cliente cli2 = new Cliente("Gabriel", true, "8911", 30);
            Cliente cli3 = new Cliente("Mamis", false, "ABCD", 50);
             cli1.autentica("4567");
             cli2.autentica("ADCX");
             cli3.autentica("ABCD");

             List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3);
            // clientes.forEach( cli -> System.out.println(cli.getCompras()));

             Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras() > 10);

             List<Cliente> selecionados = stream.collect(Collectors.toList());
             selecionados.forEach(c -> System.out.println(c.getCompras()));
    }

}