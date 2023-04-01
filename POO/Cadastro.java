public class Cadastro {
    private String nome;
    private String cpf;
    private String matricula;
    private String dataNascimento;

    public Cadastro(String nome, String cpf, String matricula, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    // getters e setters omitidos para simplificar o exemplo

    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Data de nascimento: " + dataNascimento;
    }
}
