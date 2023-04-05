import Atores.Administrador;
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
        Administrador novoAdm = new Administrador("adm", "1234");

        Comensal novoCadastroAux = new Comensal(
                "José da Silva",
                "123456789",
                "11111111111",
                "josedasilva@gmail.com",
                "01/01/2001"
        );
        Alimento alimentosCadastradosAux = new Alimento(
                "Pão com frango",
                3,
                2,
                1,
                300
        );
        CardapioSemanal cardapioSemanalAux = new CardapioSemanal(
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                "bem saudável"
        );
        CardapioMensal cardapioMensalAux = new CardapioMensal(
                cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux,
                "muito saudável"
        );

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
                    String login = JOptionPane.showInputDialog("Login: " +
                            "\nDica: tente 'adm'");
                    String senha = JOptionPane.showInputDialog("Senha:" +
                            "\nDica: tente '1234'");

                    if (login.equals(novoAdm.getLogin()) && senha.equals(novoAdm.getSenha())) {
                        admOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                                "1- Cadastrar Alimento\n " +
                                        "2- Cadastrar cardápio\n " +
                                        "3- Visualizar Cardápio\n " +
                                        "4- Gerar relatório\n " +
                                        "5- Voltar para a tela inicial")
                        );

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

                                alimentosCadastradosAux.setNome(nome);
                                alimentosCadastradosAux.setPercentualProteinas(percentualProteinas);
                                alimentosCadastradosAux.setPercentualCarboidratos(percentualCarboidratos);
                                alimentosCadastradosAux.setPercentualLipidios(percentualLipidios);
                                alimentosCadastradosAux.setQuantidade(quantidade);

                                JOptionPane.showMessageDialog(null, "Alimento cadastrado com sucesso!");

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

                                JOptionPane.showMessageDialog(null, "Cardápio cadastrado com sucesso!");

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
                            default: {
                                admOpcao = 0;

                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!");
                    }

                    break;
                }
                case 2: {
                    cmsOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "1- Fazer check-in\n " +
                            "2- Fazer recarga do cartão\n " +
                            "3- Visualizar Cardápio\n " +
                            "4- Voltar para a tela inicial")
                    );

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

                                if (opcaoCheckin == 1 && novoCadastroAux.getSaldoCartao() >= 10) {
                                    novoCadastroAux.usoCartao(10);
                                    JOptionPane.showMessageDialog(null,"Check-in realizado!\n" +
                                            "Saldo atual do cartão: " + novoCadastroAux.getSaldoCartao() + " créditos");

                                } else if (opcaoCheckin == 1 && novoCadastroAux.getSaldoCartao() < 10) {
                                    JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente " +
                                            "para " +
                                            "fazer check-in");
                                } else if (opcaoCheckin == 2) {
                                    break;
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
                        default: {
                            cmsOpcao = 0;

                            break;
                        }
                    }

                    break;
                }
                case 3: {
                    String nome = JOptionPane.showInputDialog(
                            "Nome completo: "
                    );
                    String matricula = JOptionPane.showInputDialog(
                            "Número da matrícula: "
                    );
                    String cpf = JOptionPane.showInputDialog(
                            "CPF:"
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
        }
    }
}
