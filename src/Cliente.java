import java.util.stream.Stream;

public class Cliente implements Autenticador {
    private String nome;
    private boolean status;
    private String senha;
    private int compras;


    public Cliente(String nome, boolean status, String senha, int compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }


    public String getNome() {
        return nome;
    }

    public boolean isStatus() {
        return status;
    }

    public String getSenha() {
        return senha;
    }

    public int getCompras(){ return this.compras; }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean autentica(String senha) {

            if (this.senha != senha) {
                System.out.println( "Senha Inválida");
                return false;
            }
            else{
                System.out.println("Senha Validada");
                return true;
            }

    }
}
