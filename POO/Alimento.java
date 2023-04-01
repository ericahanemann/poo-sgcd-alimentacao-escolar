public class Alimento {
    private String nome;
    private int quantidade;
    private double proteinas;
    private double carboidratos;
    private double lipidios;

    public Alimento(String nome, int quantidade, double proteinas, double carboidratos, double lipidios) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.proteinas = proteinas;
        this.carboidratos = carboidratos;
        this.lipidios = lipidios;
    }

    // getters e setters omitidos para simplificar o exemplo

    public String toString() {
        return "Alimento: " + nome + "\n" +
                "Quantidade: " + quantidade + "g\n" +
                "Proteínas: " + proteinas + "%\n" +
                "Carboidratos: " + carboidratos + "%\n" +
                "Lipídios: " + lipidios + "%";
    }
}
