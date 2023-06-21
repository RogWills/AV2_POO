public class Promotor extends Pessoa{

    private String cnpj;

    public Promotor(String nome) {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Promotor(String nome, String email, String senha, String cnpj) {
        super();
        this.cnpj = cnpj;

    }
}
