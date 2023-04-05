package ControleAlimentacao;

public class CardapioSemanal {


    private Alimento cardapioSegunda;
    private Alimento cardapioTerca;
    private Alimento cardapioQuarta;
    private Alimento cardapioQuinta;
    private Alimento cardapioSexta;
    private String informacaoNutricionalSemanal;


    public CardapioSemanal(Alimento cardapioSegunda, Alimento cardapioTerca, Alimento cardapioQuarta, Alimento cardapioQuinta, Alimento cardapioSexta, String informacaoNutricionalSemanal) {
        this.cardapioSegunda = cardapioSegunda;
        this.cardapioTerca = cardapioTerca;
        this.cardapioQuarta = cardapioQuarta;
        this.cardapioQuinta = cardapioQuinta;
        this.cardapioSexta = cardapioSexta;
        this.informacaoNutricionalSemanal = informacaoNutricionalSemanal;
    }


    public void setCardapioSegunda(Alimento cardapioSegunda) {
        this.cardapioSegunda = cardapioSegunda;
    }

    public Alimento getCardapioSegunda() {

        return cardapioSegunda;
    }

    public void setCardapioTerca(Alimento cardapioTerca) {

        this.cardapioTerca = cardapioTerca;
    }

    public Alimento getCardapioTerca() {

        return cardapioTerca;
    }

    public void setCardapioQuarta(Alimento cardapioQuarta) {

        this.cardapioQuarta = cardapioQuarta;
    }

    public Alimento getCardapioQuarta() {

        return cardapioQuarta;
    }

    public void setCardapioQuinta(Alimento cardapioQuinta) {

        this.cardapioQuinta = cardapioQuinta;
    }

    public Alimento getCardapioQuinta() {

        return cardapioQuinta;
    }

    public void setCardapioSexta(Alimento cardapioSexta) {

        this.cardapioSexta = cardapioSexta;
    }

    public Alimento getCardapioSexta() {

        return cardapioSexta;
    }

    public void setInformacaoNutricionalSemanal(String informacaoNutricionalSemanal) {
        this.informacaoNutricionalSemanal = informacaoNutricionalSemanal;
    }

    public String getInformacaoNutricionalSemanal() {

        return informacaoNutricionalSemanal;
    }
}



