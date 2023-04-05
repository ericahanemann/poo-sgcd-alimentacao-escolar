package Atores;

import javax.swing.*;

public class Comensal {
    private String nome;
    private long matricula;
    private long cpf;
    private String email;
    private String dataNascimento;
    private double saldoCartao;

    public Comensal(String nome, long matricula, long cpf, String email, String dataNascimento) {
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

    public void setMatricula(long matricula) {

        this.matricula = matricula;
    }
    public long getMatricula() {

        return matricula;
    }

    public void setCpf(long cpf) {

        this.cpf = cpf;
    }
    public long getCpf() {

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
