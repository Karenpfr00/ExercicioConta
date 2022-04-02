abstract public class Conta {
    private double sacar;
    private double depositar;
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract double sacar(double valor);
    public abstract double depositar(double valor);

}
//Sua tarefa é criar um banco!
//
//Em um banco existem clientes que possuem vários tipos: tem clientes que têm contas correntes e contas de poupança, outros não e assim por diante.
//
//A proposta é criar essas contas do banco, use uma estrutura de dados para isso (array, ArrayList, List ou outra que seja adequada).
//
//Crie também um método que calcule o valor financeiro que o banco possui em suas contas. Esse método deve somar o saldo de todas as contas existentes.
//
//Crie uma interface Tributável, e aplique suas regras nas classes da ContaCorrente e da ContaSalário.
//
//Faça também um método que permite que seja feito o download de valores entre contas. Logo, o método deve conter nos seus parâmetros a conta na qual será usado e o valor correspondente.
//
//Para ajudar o gerente do banco e fazer um teste no que foi desenvolvido agora, crie um menu de opções para as operações envolvidas