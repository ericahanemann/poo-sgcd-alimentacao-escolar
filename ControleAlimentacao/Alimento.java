package ControleAlimentacao;

public class Alimento {


    private String nome;
    private float quantidadeProteinas;
    private float quantidadeCarboidratos;
    private float quantidadeLipidios;
    private float quantidadeAlimento;


    public Alimento(String nome, float quantidadeProteinas, float quantidadeCarboidratos,
                    float quantidadeLipidios, float quantidadeAlimento) {
        this.nome = nome;
        this.quantidadeProteinas = quantidadeProteinas;
        this.quantidadeCarboidratos = quantidadeCarboidratos;
        this.quantidadeLipidios = quantidadeLipidios;
        this.quantidadeAlimento = quantidadeAlimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuantidadeProteinas() {
        return quantidadeProteinas;
    }

    public void setQuantidadeProteinas(float quantidadeProteinas) {
        this.quantidadeProteinas = quantidadeProteinas;
    }

    public float getQuantidadeCarboidratos() {
        return quantidadeCarboidratos;
    }

    public void setQuantidadeCarboidratos(float quantidadeCarboidratos) {
        this.quantidadeCarboidratos = quantidadeCarboidratos;
    }

    public float getQuantidadeLipidios() {

        return quantidadeLipidios;
    }

    public void setQuantidadeLipidios(float quantidadeLipidios) {
        this.quantidadeLipidios = quantidadeLipidios;
    }

    public float getQuantidadeAlimento() {

        return quantidadeAlimento;
    }

    public void setQuantidadeAlimento(float quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }
}


