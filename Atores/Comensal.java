package Atores;

public class Comensal {
    private String nome;
    private int matricula;
    private int cpf;
    private String email;
    private String dataNascimento;
    private double saldoCartao = 100;

    public Comensal(String nome, int matricula, int cpf, String email, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setSaldoCartao(double saldoCartao) {
        this.saldoCartao = saldoCartao;
    }
    public double getSaldoCartao() {
        return saldoCartao;
    }

    public void usoCartao(double valor) {
        this.saldoCartao -= valor;
    }
    public void recargaCartao(double valor) {
        this.saldoCartao += valor;
    }
}
