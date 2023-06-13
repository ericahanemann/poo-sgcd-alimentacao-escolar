package ControleAlimentacao;

import javax.swing.*;

public class CardapioMensal {


    private CardapioSemanal semana1;
    private CardapioSemanal semana2;
    private CardapioSemanal semana3;
    private CardapioSemanal semana4;


    public CardapioMensal(CardapioSemanal semana1, CardapioSemanal semana2, CardapioSemanal semana3, CardapioSemanal semana4) {
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
    }


    public void setSemana1(CardapioSemanal semana1) {

        this.semana1 = semana1;
    }

    public CardapioSemanal getSemana1() {

        return semana1;
    }

    public void setSemana2(CardapioSemanal semana2) {

        this.semana2 = semana2;
    }

    public CardapioSemanal getSemana2() {

        return semana2;
    }

    public void setSemana3(CardapioSemanal semana3) {

        this.semana3 = semana3;
    }

    public CardapioSemanal getSemana3() {

        return semana3;
    }

    public void setSemana4(CardapioSemanal semana4) {

        this.semana4 = semana4;
    }

    public CardapioSemanal getSemana4() {

        return semana4;
    }

    public  void mostraCardapio() {
        JOptionPane.showMessageDialog(null,
                "---------------------------------------------" +
                        "CARDÁPIO MENSAL" +
                        "---------------------------------------------\n\n" +
                        "Segunda-feira         Terça-feira         Quarta-feira         " +
                        "Quinta-feira         " +
                        "Sexta-feira\n\n" +
                        this.getSemana1().getCardapioSegunda().getNome() + "    " +
                        this.getSemana1().getCardapioTerca().getNome() + "    " +
                        this.getSemana1().getCardapioQuarta().getNome() + "    " +
                        this.getSemana1().getCardapioQuinta().getNome() + "    " +
                        this.getSemana1().getCardapioSexta().getNome() + "    " +
                        "\n" +
                        this.getSemana2().getCardapioSegunda().getNome() + "    " +
                        this.getSemana2().getCardapioTerca().getNome() + "    " +
                        this.getSemana2().getCardapioQuarta().getNome() + "    " +
                        this.getSemana2().getCardapioQuinta().getNome() + "    " +
                        this.getSemana2().getCardapioSexta().getNome() + "    " +
                        "\n" +
                        this.getSemana3().getCardapioSegunda().getNome() + "    " +
                        this.getSemana3().getCardapioTerca().getNome() + "    " +
                        this.getSemana3().getCardapioQuarta().getNome() + "    " +
                        this.getSemana3().getCardapioQuinta().getNome() + "    " +
                        this.getSemana3().getCardapioSexta().getNome() + "    " +
                        "\n" +
                        this.getSemana4().getCardapioSegunda().getNome() + "    " +
                        this.getSemana4().getCardapioTerca().getNome() + "    " +
                        this.getSemana4().getCardapioQuarta().getNome() + "    " +
                        this.getSemana4().getCardapioQuinta().getNome() + "    " +
                        this.getSemana4().getCardapioSexta().getNome() +
                        "\n\n" +
                        "----------------------------------------------------------------------------------------------------------------------" +
                        "\n\n" +
                        "MÉDIA DE NUTRIENTES DIÁRIOS" + "\n" +
                        "- Semana 01: " + this.getSemana1().getInformacaoNutricionalSemanal() +
                        "\n" +
                        "- Semana 02: " + this.getSemana2().getInformacaoNutricionalSemanal() +
                        "\n" +
                        "- Semana 03: " + this.getSemana3().getInformacaoNutricionalSemanal() +
                        "\n" +
                        "- Semana 04: " + this.getSemana4().getInformacaoNutricionalSemanal() +
                        "\n"
        );

    }
}


