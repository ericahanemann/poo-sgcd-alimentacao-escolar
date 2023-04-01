import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao;

        do {
            String menu = "Escolha uma opção:\n" +
                    "1. Cadastrar Aluno\n" +
                    "2. Cadastrar alimento\n" +
                    "3. Cadastrar cardápio\n" +
                    "4. Sair";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    cadastrarCadastro();
                    break;
                case 2:
                    cadastrarAlimento();
                    break;
                case 3:
                    cadastrarCardapio();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }

    private static void cadastrarCadastro() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");

        Cadastro cadastro = new Cadastro(nome, cpf, matricula, dataNascimento);

        JOptionPane.showMessageDialog(null, cadastro.toString());
    }

    private static void cadastrarAlimento() {
        String nome = JOptionPane.showInputDialog("Nome do alimento:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade (em gramas):"));
        double proteinas = Double.parseDouble(JOptionPane.showInputDialog("Percentual de proteínas:"));
        double carboidratos = Double.parseDouble(JOptionPane.showInputDialog("Percentual de carboidratos:"));
        double lipidios = Double.parseDouble(JOptionPane.showInputDialog("Percentual de lipídios:"));

        Alimento alimento = new Alimento(nome, quantidade, proteinas, carboidratos, lipidios);

        JOptionPane.showMessageDialog(null, alimento.toString());
    }

    private static void cadastrarCardapio() {
        String diaSemana = JOptionPane.showInputDialog("Dia da semana:");

        String nomeAlimento1 = JOptionPane.showInputDialog("Vamos Cadastrar 3 alimentos :Nome do alimento :");
        int quantidadeAlimento1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do alimento  (em gramas):"));
        double proteinasAlimento1 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de proteínas do alimento :"));
        double carboidratosAlimento1 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de carboidratos do alimento :"));
        double lipidiosAlimento1 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de lipídios do alimento :"));

        Alimento alimento1 = new Alimento(nomeAlimento1, quantidadeAlimento1, proteinasAlimento1, carboidratosAlimento1, lipidiosAlimento1);

        String nomeAlimento2 = JOptionPane.showInputDialog("Nome do alimento 2:");
        int quantidadeAlimento2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do alimento  (em gramas):"));
        double proteinasAlimento2 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de proteínas do alimento :"));
        double carboidratosAlimento2 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de carboidratos do alimento :"));
        double lipidiosAlimento2 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de lipídios do alimento :"));

        Alimento alimento2 = new Alimento(nomeAlimento2, quantidadeAlimento2, proteinasAlimento2, carboidratosAlimento2, lipidiosAlimento2);

        String nomeAlimento3 = JOptionPane.showInputDialog("Nome do alimento :");
        int quantidadeAlimento3 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do alimento  (em gramas):"));
        double proteinasAlimento3 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de proteínas do alimento :"));
        double carboidratosAlimento3 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de carboidratos do alimento :"));
        double lipidiosAlimento3 = Double.parseDouble(JOptionPane.showInputDialog("Percentual de lipídios do alimento :"));

        Alimento alimento3 = new Alimento(nomeAlimento3, quantidadeAlimento3, proteinasAlimento3, carboidratosAlimento3, lipidiosAlimento3);

        Cardapio cardapio = new Cardapio(diaSemana, alimento1, alimento2, alimento3);

        JOptionPane.showMessageDialog(null, cardapio.toString());
    }
}