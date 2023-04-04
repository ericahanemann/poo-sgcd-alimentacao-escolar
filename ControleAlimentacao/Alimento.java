package ControleAlimentacao;

public class Alimento {


    private String nome;
    private float percentualProteinas;
    private float percentualCarboidratos;
    private float percentualLipidios;
    private float quantidade;


    public Alimento(String nome, float percentualProteinas, float percentualCarboidratos, float percentualLipidios, float quantidade) {
        this.nome = nome;
        this.percentualProteinas = percentualProteinas;
        this.percentualCarboidratos = percentualCarboidratos;
        this.percentualLipidios = percentualLipidios;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentualProteinas() {
        return percentualProteinas;
    }

    public void setPercentualProteinas(float percentualProteinas) {
        this.percentualProteinas = percentualProteinas;
    }

    public float getPercentualCarboidratos() {
        return percentualCarboidratos;
    }

    public void setPercentualCarboidratos(float percentualCarboidratos) {
        this.percentualCarboidratos = percentualCarboidratos;
    }

    public float getPercentualLipidios() {
        return percentualLipidios;
    }

    public void setPercentualLipidios(float percentualLipidios) {
        this.percentualLipidios = percentualLipidios;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
}


