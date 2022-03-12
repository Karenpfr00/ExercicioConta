public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        cc.depositar(500);
        cc.depositar(50);
        cc.sacar(560);
        cc.depositar(50);
        cc.sacar(10);
    }

}
