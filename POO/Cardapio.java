public class Cardapio {
    private String diaSemana;
    private Alimento alimento1;
    private Alimento alimento2;
    private Alimento alimento3;

    public Cardapio(String diaSemana, Alimento alimento1, Alimento alimento2, Alimento alimento3) {
        this.diaSemana = diaSemana;
        this.alimento1 = alimento1;
        this.alimento2 = alimento2;
        this.alimento3 = alimento3;
    }

    // getters e setters omitidos para simplificar o exemplo

    public String toString() {
        return "Dia da semana: " + diaSemana + "\n" +
                "Alimento 1:\n" + alimento1.toString() + "\n" +
                "Alimento 2:\n" + alimento2.toString() + "\n" +
                "Alimento 3:\n" + alimento3.toString();
    }
}
