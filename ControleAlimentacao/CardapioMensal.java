package ControleAlimentacao;

public class CardapioMensal {


    private CardapioSemanal semana1;
    private CardapioSemanal semana2;
    private CardapioSemanal semana3;
    private CardapioSemanal semana4;
    private String informacaoNutricionalMensal;


    public CardapioMensal(CardapioSemanal semana1, CardapioSemanal semana2, CardapioSemanal semana3, CardapioSemanal semana4, String informacaoNutricionalMensal) {
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
        this.informacaoNutricionalMensal = informacaoNutricionalMensal;
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

    public void setInformacaoNutricionalMensal(String informacaoNutricionalMensal) {
        this.informacaoNutricionalMensal = informacaoNutricionalMensal;
    }

    public String getInformacaoNutricionalMensal() {
        return informacaoNutricionalMensal;
    }
}


