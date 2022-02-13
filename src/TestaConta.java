public class TestaConta {
        public static void main(String[] args) {
            ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00, 1100.00, 5000.00);
            System.out.println("Informações da Conta Corrente");

            System.out.println("Disponível de cheque especial: "+ cc1.getChequeEspecial());
            System.out.println("O saldo da conta corrente é R$ " +cc1.getSaldo());
            System.out.println("Valor de saque é R$ " +cc1.sacar);
            System.out.println("Valor máximo de depósito por dia é de R$ " + cc1.depositar);
            

            System.out.println("-------------------------------------------------");

            ContaPoupanca p1 = new ContaPoupanca(33, 3, "Banco CCC", 10.00, 20, 0.05, 10.00, 5000.00);
            System.out.println("Informações da Conta Poupança");
            System.out.println("O saldo da conta poupança é R$ " +p1.getSaldo());
            System.out.println("Valor de saque é R$ " +p1.sacar);
            System.out.println("Valor máximo de depósito por dia é de R$ " +p1.depositar);

            System.out.println("-------------------------------------------------------");
            ContaSalario cs1 = new ContaSalario(33,3,"Banco CCC", 1230.00,1230.00,5, 0);
            System.out.println("Informações da Conta Salário");
            System.out.println("O saldo da conta é R$ " + cs1.saldo);
            System.out.println("Quantidade de saques disponiveis por mês: " +cs1.getQtdSaque());

        }
}
