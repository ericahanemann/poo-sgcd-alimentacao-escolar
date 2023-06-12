package Atores;

public class Administrador extends Ator {
    private String login;
    private String senha;

    public Administrador(String nome, String cpf, String email, String dataNascimento, String login,
                         String senha) {
        super(nome, cpf, email, dataNascimento);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
