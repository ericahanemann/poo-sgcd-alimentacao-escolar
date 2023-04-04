package Atores;

import ControleAlimentacao.Alimento;
import ControleAlimentacao.CardapioMensal;
import ControleAlimentacao.CardapioSemanal;

import javax.swing.*;

public class Administrador {

    private String login;
    private String senha;
    private CardapioSemanal cardapioSemanal;
    private CardapioMensal cardapioMensal;

    public Administrador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }
}
