import Atores.Comensal;
import ControleAlimentacao.Alimento;
import ControleAlimentacao.CardapioMensal;
import ControleAlimentacao.CardapioSemanal;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tipoUsuario, admOpcao = 99, cmsOpcao = 99;
        Comensal novoCadastroAux = new Comensal("", 0, 0, "", "");
        Alimento alimentosCadastradosAux = new Alimento("-----------", 0, 0, 0, 0);
        CardapioSemanal cardapioSemanalAux = new CardapioSemanal(alimentosCadastradosAux,
                alimentosCadastradosAux, alimentosCadastradosAux, alimentosCadastradosAux,
                alimentosCadastradosAux, "");
        CardapioMensal cardapioMensalAux = new CardapioMensal(cardapioSemanalAux,
                cardapioSemanalAux, cardapioSemanalAux, cardapioSemanalAux, "");

        tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entrar como:\n " +
                "1- Administrador\n " +
                "2- Comensal\n 3- Fazer seu cadastro"));

        while (admOpcao != 0 || cmsOpcao != 0) {
            switch (tipoUsuario) {
                case 1: {
                    admOpcao = Integer.parseInt(JOptionPane.showInputDialog("1- " +
                            "Cadastrar " +
                            "Alimento\n 2- Cadastrar cardápio\n 3- Visualizar Cardápio\n 4- Gerar " +
                            "relatório\n 5- Voltar para a tela inicial"));

                    break;
                }
                case 2: {
                    cmsOpcao = Integer.parseInt(JOptionPane.showInputDialog("1- Fazer check-in\n 2- " +
                            "Fazer recarga do cartão\n 3- Visualizar Cardápio\n 4- Voltar para a " +
                            "tela inicial"));

                    break;
                }
                case 3: {
                    String nome = JOptionPane.showInputDialog("Nome completo: ");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Número da " +
                            "matrícula: "));
                    int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF:"));
                    String email = JOptionPane.showInputDialog("Email:");
                    String dataNascimento = JOptionPane.showInputDialog("Data de nascimento (dd/mm/aaaa)");

                    Comensal novoCadastro = new Comensal(nome, matricula, cpf, email, dataNascimento);
                    novoCadastroAux = new Comensal(nome, matricula, cpf, email, dataNascimento);

                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

                    break;
                }
            }

            switch (admOpcao) {
                case 1: {
                    String nome = JOptionPane.showInputDialog("Nome do alimento: ");
                    float percentualProteinas = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de proteínas: " +
                                    ": "));
                    float percentualCarboidratos = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de carboidratos: " +
                                    ": "));
                    float percentualLipidios = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de lipídios: " +
                                    ": "));
                    float quantidade = Float.parseFloat(JOptionPane.showInputDialog("Quantidade (em " +
                            "gramas): "));

                    Alimento alimento = new Alimento(nome,
                            percentualProteinas,
                            percentualCarboidratos,
                            percentualLipidios, quantidade);
                    alimentosCadastradosAux = alimento;

                    break;
                }
                case 2: {
                    int semanaCardapio = Integer.parseInt(JOptionPane.showInputDialog("Você deseja fazer " +
                            "cadastro" +
                            " do cardápio" +
                            " de qual " +
                            "semana?\n 1- Semana 1\n 2- Semana 2\n 3- Semana 3\n 4- Semana 4"));

                    int cardapioSegunda = Integer.parseInt(JOptionPane.showInputDialog("Escolha o cardápio de " +
                            "segunda-feira:\n 1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"));
                    int cardapioTerca = Integer.parseInt(JOptionPane.showInputDialog("Escolha o " +
                            "cardápio de " +
                            "terca-feira:\n 1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"));
                    int cardapioQuarta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o " +
                            "cardápio de " +
                            "quarta-feira:\n 1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"));
                    int cardapioSQuinta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o " +
                            "cardápio de " +
                            "quinta-feira:\n 1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"));
                    int cardapioSexta = Integer.parseInt(JOptionPane.showInputDialog("Escolha o " +
                            "cardápio de " +
                            "sexta-feira:\n 1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"));
                    String informacaoNutricionaSemanal = "bem saudável";
                    String informacaoNutricionaMensal = "super saudável";

                    CardapioSemanal cardapioSemanal = new CardapioSemanal(alimentosCadastradosAux,
                            alimentosCadastradosAux, alimentosCadastradosAux, alimentosCadastradosAux,
                            alimentosCadastradosAux, informacaoNutricionaSemanal);

                    switch (semanaCardapio) {
                        case 1: {
                            cardapioMensalAux.setSemana1(cardapioSemanal);

                            break;
                        }
                        case 2: {
                            cardapioMensalAux.setSemana2(cardapioSemanal);

                            break;
                        }
                        case 3: {
                            cardapioMensalAux.setSemana3(cardapioSemanal);

                            break;
                        }
                        case 4: {
                            cardapioMensalAux.setSemana4(cardapioSemanal);

                            break;
                        }
                    }

                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(null, "------------------------------CARDÁPIO " +
                            "MENSAL------------------------------\n\n" +
                            "Segunda-feira     Terça-feira     Quarta-feira     Quinta-feira     " +
                            "Sexta-feira\n" +
                            cardapioMensalAux.getSemana1().getCardapioSegunda().getNome() + "    " +
                            cardapioMensalAux.getSemana1().getCardapioTerca().getNome() + "    " +
                            cardapioMensalAux.getSemana1().getCardapioQuarta().getNome() + "    " +
                            cardapioMensalAux.getSemana1().getCardapioQuinta().getNome() + "    " +
                            cardapioMensalAux.getSemana1().getCardapioSexta().getNome() + "    " +
                            "\n" +
                            cardapioMensalAux.getSemana2().getCardapioSegunda().getNome() + "    " +
                            cardapioMensalAux.getSemana2().getCardapioTerca().getNome() + "    " +
                            cardapioMensalAux.getSemana2().getCardapioQuarta().getNome() + "    " +
                            cardapioMensalAux.getSemana2().getCardapioQuinta().getNome() + "    " +
                            cardapioMensalAux.getSemana2().getCardapioSexta().getNome() + "    " +
                            "\n" +
                            cardapioMensalAux.getSemana3().getCardapioSegunda().getNome() + "    " +
                            cardapioMensalAux.getSemana3().getCardapioTerca().getNome() + "    " +
                            cardapioMensalAux.getSemana3().getCardapioQuarta().getNome() + "    " +
                            cardapioMensalAux.getSemana3().getCardapioQuinta().getNome() + "    " +
                            cardapioMensalAux.getSemana3().getCardapioSexta().getNome() + "    " +
                            "\n" +
                            cardapioMensalAux.getSemana4().getCardapioSegunda().getNome() + "    " +
                            cardapioMensalAux.getSemana4().getCardapioTerca().getNome() + "    " +
                            cardapioMensalAux.getSemana4().getCardapioQuarta().getNome() + "    " +
                            cardapioMensalAux.getSemana4().getCardapioQuinta().getNome() + "    " +
                            cardapioMensalAux.getSemana4().getCardapioSexta().getNome()
                    );

                    break;
                }

                case 4: {
                    JOptionPane.showMessageDialog(null, "Gerando relatório...\n (se eu fosse você não" +
                            " esperaria muito tempo");

                    break;
                }
                case 5: {
                    tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entrar como:\n " +
                            "1- Administrador\n " +
                            "2- Comensal\n 3- Fazer seu cadastro"));

                    admOpcao = 99;

                    break;
                }
                default: {
                    admOpcao = 0;

                    break;
                }
            }


            switch (cmsOpcao) {
                case 1: {
                    JOptionPane.showInputDialog("Digite seu CPF:");
                    novoCadastroAux.usoCartao(10);

                    JOptionPane.showMessageDialog(null,"Check-in realizado!\n" +
                            "Saldo atual do cartão: R$" + novoCadastroAux.getSaldoCartao());

                    break;
                }

                case 2: {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da " +
                            "recarga:"));
                    novoCadastroAux.recargaCartao(valor);

                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(null, "--------------------CARDÁPIO " +
                            "MENSAL--------------------\n\n" +
                            "Segunda-feira     Terça-feira     Quarta-feira     Quinta-feira     " +
                            "Sexta-feira\n" +
                            cardapioMensalAux.getSemana1().getCardapioSegunda().getNome() + " " +
                            cardapioMensalAux.getSemana1().getCardapioTerca().getNome() + " " +
                            cardapioMensalAux.getSemana1().getCardapioQuarta().getNome() + " " +
                            cardapioMensalAux.getSemana1().getCardapioQuinta().getNome() + " " +
                            cardapioMensalAux.getSemana1().getCardapioSexta().getNome() + " " +
                            "\n" +
                            cardapioMensalAux.getSemana2().getCardapioSegunda().getNome() + " " +
                            cardapioMensalAux.getSemana2().getCardapioTerca().getNome() + " " +
                            cardapioMensalAux.getSemana2().getCardapioQuarta().getNome() + " " +
                            cardapioMensalAux.getSemana2().getCardapioQuinta().getNome() + " " +
                            cardapioMensalAux.getSemana2().getCardapioSexta().getNome() + " " +
                            "\n" +
                            cardapioMensalAux.getSemana3().getCardapioSegunda().getNome() + " " +
                            cardapioMensalAux.getSemana3().getCardapioTerca().getNome() + " " +
                            cardapioMensalAux.getSemana3().getCardapioQuarta().getNome() + " " +
                            cardapioMensalAux.getSemana3().getCardapioQuinta().getNome() + " " +
                            cardapioMensalAux.getSemana3().getCardapioSexta().getNome() + " " +
                            "\n" +
                            cardapioMensalAux.getSemana4().getCardapioSegunda().getNome() + " " +
                            cardapioMensalAux.getSemana4().getCardapioTerca().getNome() + " " +
                            cardapioMensalAux.getSemana4().getCardapioQuarta().getNome() + " " +
                            cardapioMensalAux.getSemana4().getCardapioQuinta().getNome() + " " +
                            cardapioMensalAux.getSemana4().getCardapioSexta().getNome()
                    );

                    break;
                }
                case 4: {
                    tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entrar como:\n " +
                            "1- Administrador\n " +
                            "2- Comensal\n 3- Fazer seu cadastro"));

                    cmsOpcao = 99;

                    break;
                }
                default: {
                    cmsOpcao = 0;

                    break;
                }
            }
        }
    }
}
