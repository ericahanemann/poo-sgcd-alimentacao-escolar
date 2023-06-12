package Atores;

public class Comensal extends Ator {
    private String matricula;
    private float saldoCartao;

    public Comensal(String nome, String cpf, String email, String dataNascimento, String matricula,
                    float saldoCartao) {
        super(nome, cpf, email, dataNascimento);
        this.matricula = matricula;
        this.saldoCartao = saldoCartao;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSaldoCartao() {
        return this.saldoCartao;
    }

    public void setSaldoCartao(float saldoCartao) {
        this.saldoCartao = saldoCartao;
    }

    public void recargaCartao(double valor) {
        this.saldoCartao += valor;
    }

    public void usoCartao(float valor) {
        this.saldoCartao -= valor;
    }
}
