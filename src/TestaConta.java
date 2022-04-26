import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestaConta {


    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);
        ContaPJ cpj = new ContaPJ(100, 20000);
        ContaSalario cs = new ContaSalario(4);
        ContaPoupanca cp = new ContaPoupanca(1000);

        System.out.println("--------------------");
        List<Conta> contaList = Arrays.asList(cc, cp, cpj, cs);

        for(Conta conta:contaList) {
                System.out.println(conta);
        }

        Cliente cli1 = new Cliente("Cliente01", true, "1234", 10);
        Cliente cli2 = new Cliente("Cliente02", true, "8911", 30);
        Cliente cli3 = new Cliente("Cliente03", true, "ABCD", 50);
        Cliente cli4 = new Cliente("Cliente04", true, "EFGH", 95);
        Cliente cli5 = new Cliente("Cliente05", true, "4567", 12);
        Cliente cli6 = new Cliente("Cliente06", true, "IJKL", 22);
        Cliente cli7 = new Cliente("Cliente07", true, "6789", 88);
        Cliente cli8 = new Cliente("Cliente08", true, "KMNO", 6);
        Cliente cli9 = new Cliente("Cliente09", true, "9876", 70);
        Cliente cli10 = new Cliente("Cliente10", true, "PQRS", 9);


        cli1.autentica("4567");
        cli2.autentica("ADCX");
        cli3.autentica("ABCD");
        System.out.println("--------------------");

        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10);

        clientes.forEach( cli -> System.out.println(cli.getCompras()));

        System.out.println("--------------------");
        Comparator<Cliente> comparatorMaior = Comparator.comparing(Cliente::getCompras);
        List<Cliente> maisCompras = clientes.stream().max(comparatorMaior).stream().toList();
        System.out.println(maisCompras);
        System.out.println("--------------------");

        Comparator<Cliente> comparatorMenor = Comparator.comparing(Cliente::getCompras);
        List<Cliente> menosCompras = clientes.stream().min(comparatorMenor).stream().toList();
        System.out.println(menosCompras);
        System.out.println("--------------------");



    }

}