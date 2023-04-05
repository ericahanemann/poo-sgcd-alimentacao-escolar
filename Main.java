import Atores.Comensal;
import ControleAlimentacao.Alimento;
import ControleAlimentacao.CardapioMensal;
import ControleAlimentacao.CardapioSemanal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //controle
        int tipoUsuario = 99, admOpcao = 0, cmsOpcao = 0;

        //estanciando objetos
        Comensal novoCadastroAux = new Comensal(
                "José da Silva",
                12345678,
                11111111111L,
                "josedasilva@gmail.com",
                "01/01/2001"
        );
        Alimento alimentosCadastradosAux = new Alimento(
                "-----------",
                0,
                0,
                0,
                0
        );
        CardapioSemanal cardapioSemanalAux = new CardapioSemanal(
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                ""
        );
        CardapioMensal cardapioMensalAux = new CardapioMensal(cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux,
                "");

        //menu
        while (tipoUsuario != 0) {
            tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog(
                    "Entrar como:\n " +
                    "0- Sair\n" +
                    "1- Administrador\n " +
                    "2- Comensal\n " +
                    "3- Fazer seu cadastro")
            );

            switch (tipoUsuario) {
                case 0: {
                    break;
                }
                case 1: {
                    //será feita uma verificação futuramente
                    JOptionPane.showInputDialog("Login: ");
                    JOptionPane.showInputDialog("Senha:");

                    admOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "1- Cadastrar Alimento\n " +
                            "2- Cadastrar cardápio\n " +
                            "3- Visualizar Cardápio\n " +
                            "4- Gerar relatório\n " +
                            "5- Voltar para a tela inicial")
                    );

                    break;
                }
                case 2: {
                    cmsOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "1- Fazer check-in\n " +
                            "2- Fazer recarga do cartão\n " +
                            "3- Visualizar Cardápio\n " +
                            "4- Voltar para a tela inicial")
                    );

                    break;
                }
                case 3: {
                    String nome = JOptionPane.showInputDialog(
                            "Nome completo: "
                    );
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog(
                            "Número da matrícula: ")
                    );
                    int cpf = Integer.parseInt(JOptionPane.showInputDialog(
                            "CPF:")
                    );
                    String email = JOptionPane.showInputDialog(
                            "Email:"
                    );
                    String dataNascimento = JOptionPane.showInputDialog(
                            "Data de nascimento (dd/mm/aaaa)"
                    );

                    novoCadastroAux.setNome(nome);
                    novoCadastroAux.setMatricula(matricula);
                    novoCadastroAux.setCpf(cpf);
                    novoCadastroAux.setEmail(email);
                    novoCadastroAux.setDataNascimento(dataNascimento);

                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");

                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

                    break;
                }
            }

            switch (admOpcao) {
                case 1: {
                    String nome = JOptionPane.showInputDialog(
                            "Nome do alimento:"
                    );
                    float percentualProteinas = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de proteínas:"
                    ));
                    float percentualCarboidratos = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de carboidratos:"
                    ));
                    float percentualLipidios = Float.parseFloat(JOptionPane.showInputDialog(
                            "Percentual de lipídios:"
                    ));
                    float quantidade = Float.parseFloat(JOptionPane.showInputDialog(
                            "Quantidade (em gramas):"
                    ));

                    alimentosCadastradosAux = new Alimento(
                            nome,
                            percentualProteinas,
                            percentualCarboidratos,
                            percentualLipidios,
                            quantidade
                    );

                    break;
                }
                case 2: {
                    int semanaCardapio = Integer.parseInt(JOptionPane.showInputDialog(
                            "Você deseja fazer cadastro do cardápio de qual semana?\n " +
                            "1- Semana 1\n " +
                            "2- Semana 2\n " +
                            "3- Semana 3\n " +
                            "4- Semana 4"
                    ));

                    int cardapioSegunda = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha o cardápio de segunda-feira:\n " +
                            "1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"
                    ));
                    cardapioSemanalAux.setCardapioSegunda(alimentosCadastradosAux);

                    int cardapioTerca = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha o cardápio de terca-feira:\n " +
                            "1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"
                    ));
                    cardapioSemanalAux.setCardapioTerca(alimentosCadastradosAux);

                    int cardapioQuarta = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha o cardápio de quarta-feira:\n " +
                            "1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"
                    ));
                    cardapioSemanalAux.setCardapioQuarta(alimentosCadastradosAux);

                    int cardapioSQuinta = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha o cardápio de quinta-feira:\n " +
                            "1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"
                    ));
                    cardapioSemanalAux.setCardapioQuinta(alimentosCadastradosAux);

                    int cardapioSexta = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha o cardápio de sexta-feira:\n " +
                            "1-" + alimentosCadastradosAux.getNome() +
                            "\nPercentual de proteínas: " + alimentosCadastradosAux.getPercentualProteinas() +
                            "\nPercentual de carboidratos: " + alimentosCadastradosAux.getPercentualCarboidratos() +
                            "\nPercentual de lipídios: " + alimentosCadastradosAux.getPercentualLipidios() +
                            "\nQuantidade: " + alimentosCadastradosAux.getQuantidade() + "g"
                    ));
                    cardapioSemanalAux.setCardapioSexta(alimentosCadastradosAux);

                    String informacaoNutricionaSemanal = "bem saudável";
                    String informacaoNutricionaMensal = "super saudável";
                    cardapioSemanalAux.setInformacaoNutricionalSemanal(informacaoNutricionaSemanal);
                    cardapioMensalAux.setInformacaoNutricionalMensal(informacaoNutricionaMensal);

                    switch (semanaCardapio) {
                        case 1: {
                            cardapioMensalAux.setSemana1(cardapioSemanalAux);

                            break;
                        }
                        case 2: {
                            cardapioMensalAux.setSemana2(cardapioSemanalAux);

                            break;
                        }
                        case 3: {
                            cardapioMensalAux.setSemana3(cardapioSemanalAux);

                            break;
                        }
                        case 4: {
                            cardapioMensalAux.setSemana4(cardapioSemanalAux);

                            break;
                        }
                    }

                    break;
                }

                case 3: {
                    cardapioMensalAux.mostraCardapio();

                    break;
                }

                case 4: {
                    JOptionPane.showMessageDialog(null, "Gerando relatório...\n " +
                            "(se eu fosse você não esperaria muito tempo)"
                    );

                    break;
                }
                case 5: {

                    break;
                }
                default: {
                    admOpcao = 0;

                    break;
                }
            }


            switch (cmsOpcao) {
                case 1: {
                    int opcaoCheckin = 0;

                    JOptionPane.showInputDialog("Digite seu CPF:");

                    while (opcaoCheckin != 1 && opcaoCheckin != 2) {
                        opcaoCheckin = Integer.parseInt(JOptionPane.showInputDialog(
                                "Nome: " + novoCadastroAux.getNome() +
                                "\nMatrícula: " + novoCadastroAux.getMatricula() +
                                "\nSaldo do cartão: " + novoCadastroAux.getSaldoCartao() +
                                "\n\nDeseja fazer check-in? (-10 créditos)" +
                                "\n1- Sim" +
                                "\n2- Não"
                        ));

                        if (opcaoCheckin == 1) {
                            novoCadastroAux.usoCartao(10);
                            JOptionPane.showMessageDialog(null,"Check-in realizado!\n" +
                                    "Saldo atual do cartão: " + novoCadastroAux.getSaldoCartao() + " créditos");

                        } else if (opcaoCheckin == 2) {
                            cmsOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                                    "1- Fazer check-in\n " +
                                    "2- Fazer recarga do cartão\n " +
                                    "3- Visualizar Cardápio\n " +
                                    "4- Voltar para a tela inicial")
                            );
                        }
                    }

                    break;
                }

                case 2: {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da " +
                            "recarga:"));
                    novoCadastroAux.recargaCartao(valor);

                    break;
                }

                case 3: {
                    cardapioMensalAux.mostraCardapio();

                    break;
                }
                case 4: {
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
