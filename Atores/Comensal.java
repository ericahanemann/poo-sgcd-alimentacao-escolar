package Atores;

import javax.swing.*;

public class Comensal {
    private String nome;
    private String matricula;
    private String cpf;
    private String email;
    private String dataNascimento;
    private double saldoCartao;

    public Comensal(String nome, String matricula, String cpf, String email,
                    String dataNascimento) {
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

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }
    public String getMatricula() {

        return matricula;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }
    public String getCpf() {

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
