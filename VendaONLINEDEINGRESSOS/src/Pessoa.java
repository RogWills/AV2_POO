public class Pessoa {

    private String nome,email,senha;

    public Pessoa() {

    }

    public static void add(Pessoa pessoa1) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa(String nomePessoa) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }
}
