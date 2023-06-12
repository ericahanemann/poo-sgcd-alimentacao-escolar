public class Comensal extends Ator {
    private int matricula;
    private float saldoCartao;

    public Comensal(String nome, int cpf, String email, String dataNascimento, int matricula, float saldoCartao) {
        super(nome, cpf, email, dataNascimento);
        this.matricula = matricula;
        this.saldoCartao = saldoCartao;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSaldoCartao() {
        return this.saldoCartao;
    }

    public void setSaldoCartao(float saldoCartao) {
        this.saldoCartao = saldoCartao;
    }
}
