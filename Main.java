import Atores.Administrador;
import Atores.Comensal;
import ControleAlimentacao.Alimento;
import ControleAlimentacao.CardapioMensal;
import ControleAlimentacao.CardapioSemanal;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //controle
        int tipoUsuario = 99, admOpcao = 99, cmsOpcao = 99, numeroCheckins = 0, numeroCadastros = 0;

        ArrayList<LocalDate> listaDataCheckin = new ArrayList<LocalDate>();
        ArrayList<LocalDate> listaDataCadastro = new ArrayList<LocalDate>();
        ArrayList<Administrador> listaAdms = new ArrayList<Administrador>();
        ArrayList<Comensal> listaComensais = new ArrayList<Comensal>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<Alimento>();

        //estanciando objetos
        Administrador novoAdm = new Administrador(
                "Cirilo",
                "123456789",
                "cirilo@gmail.com",
                "01/01/1990",
                "adm",
                "1234");
        listaAdms.add(novoAdm);

        Comensal novoCadastroAux = new Comensal(
                "José da Silva",
                "987654321",
                "josedasilva@gmail.com",
                "02/02/2002",
                "22222222222",
                0
        );
        listaComensais.add(novoCadastroAux);

        Alimento alimento1 = new Alimento(
                "Pão com frango",
                3,
                2,
                1,
                300
        );
        Alimento alimentosCadastradosAux = new Alimento(
                "---------------------",
                0,
                0,
                0,
                0
        );
        listaAlimentos.add(alimento1);

        CardapioSemanal cardapioSemanalAux = new CardapioSemanal(
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                alimentosCadastradosAux,
                " "
        );
        CardapioMensal cardapioMensalAux = new CardapioMensal(
                cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux,
                cardapioSemanalAux
        );

        //menu
        while (tipoUsuario != 0) {
            tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog(
                    "Entrar como:\n " +
                    "0- Sair\n " +
                    "1- Administrador\n " +
                    "2- Comensal\n " +
                    "3- Fazer seu cadastro")
            );

            admOpcao = 99;

            switch (tipoUsuario) {
                case 0: {
                    break;
                }
                case 1: {
                    String login = JOptionPane.showInputDialog("Login: " +
                            "\nDica: tente 'adm'");
                    String senha = JOptionPane.showInputDialog("Senha:" +
                            "\nDica: tente '1234'");
                    boolean encontrado = false;

                    for (Administrador admin : listaAdms) {
                        if (admin.getLogin().equals(login) && admin.getSenha().equals(senha)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {

                        while (admOpcao != 0) {
                            admOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                                    " 0- Voltar para o menu principal\n " +
                                    "1- Cadastrar Alimento\n " +
                                    "2- Cadastrar cardápio\n " +
                                    "3- Visualizar Cardápio\n " +
                                    "4- Gerar relatório")
                            );

                            switch (admOpcao) {
                                case 0: {
                                    break;
                                }
                                case 1: {
                                    String nome = JOptionPane.showInputDialog(
                                            "Nome do alimento:"
                                    );
                                    float quantidadeProteinas =
                                            Float.parseFloat(JOptionPane.showInputDialog(
                                            "Quantidade de proteínas (em gramas):"
                                    ));
                                    float quantidadeCarboidratos =
                                            Float.parseFloat(JOptionPane.showInputDialog(
                                            "Quantidade de carboidratos (em gramas):"
                                    ));
                                    float quantidadeLipidios =
                                            Float.parseFloat(JOptionPane.showInputDialog(
                                            "Quantidade de lipídios (em gramas):"
                                    ));
                                    float quantidadeAlimento =
                                            Float.parseFloat(JOptionPane.showInputDialog(
                                            "Quantidade (em gramas):"
                                    ));

                                    Alimento novoAlimento = new Alimento(nome,
                                            quantidadeProteinas,
                                            quantidadeCarboidratos,
                                            quantidadeLipidios,
                                            quantidadeAlimento);
                                    listaAlimentos.add(novoAlimento);

                                    JOptionPane.showMessageDialog(null, "Alimento cadastrado com sucesso!");

                                    break;
                                }
                                case 2: {
                                    String alimentosCadastrados = "";

                                    for (int i = 0; i < listaAlimentos.size(); i++) {
                                        Alimento alimento = listaAlimentos.get(i);

                                        String nome = alimento.getNome();
                                        float quantidadeProteinas =
                                                alimento.getQuantidadeProteinas();
                                        float quantidadeCarboidratos =
                                                alimento.getQuantidadeCarboidratos();
                                        float quantidadeLipidios = alimento.getQuantidadeLipidios();
                                        float quantidadeAlimento = alimento.getQuantidadeAlimento();

                                        String dadosAlimento = i + " - Nome: " + nome + "\n"
                                                + "Percentual de Proteínas: " + quantidadeProteinas + "g\n"
                                                + "Percentual de Carboidratos: " + quantidadeCarboidratos + "g\n"
                                                + "Percentual de Lipídios: " + quantidadeLipidios + "g\n"
                                                + "Quantidade: " + quantidadeAlimento + " g\n\n";

                                        alimentosCadastrados += dadosAlimento;
                                    }

                                    int semanaCardapio = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Você deseja fazer cadastro do cardápio de qual semana?\n " +
                                                    "1- Semana 1\n " +
                                                    "2- Semana 2\n " +
                                                    "3- Semana 3\n " +
                                                    "4- Semana 4"
                                    ));

                                    int cardapioSegunda = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Escolha o cardápio de segunda-feira:\n " +
                                                    alimentosCadastrados
                                    ));

                                    int cardapioTerca = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Escolha o cardápio de terca-feira:\n " +
                                                    alimentosCadastrados
                                    ));

                                    int cardapioQuarta = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Escolha o cardápio de quarta-feira:\n " +
                                                    alimentosCadastrados
                                    ));

                                    int cardapioSQuinta = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Escolha o cardápio de quinta-feira:\n " +
                                                    alimentosCadastrados
                                    ));

                                    int cardapioSexta = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Escolha o cardápio de sexta-feira:\n " +
                                                    alimentosCadastrados
                                    ));

                                    float mediaProteinasDiarias = (
                                            listaAlimentos.get(cardapioSegunda).getQuantidadeProteinas()
                                            + listaAlimentos.get(cardapioTerca).getQuantidadeProteinas()
                                            + listaAlimentos.get(cardapioQuarta).getQuantidadeProteinas()
                                            + listaAlimentos.get(cardapioSQuinta).getQuantidadeProteinas()
                                            + listaAlimentos.get(cardapioSexta).getQuantidadeProteinas()
                                            ) / 5;

                                    float mediaCarboidratosDiarios = (
                                            listaAlimentos.get(cardapioSegunda).getQuantidadeCarboidratos()
                                                    + listaAlimentos.get(cardapioTerca).getQuantidadeCarboidratos()
                                                    + listaAlimentos.get(cardapioQuarta).getQuantidadeCarboidratos()
                                                    + listaAlimentos.get(cardapioSQuinta).getQuantidadeCarboidratos()
                                                    + listaAlimentos.get(cardapioSexta).getQuantidadeCarboidratos()
                                    ) / 5;

                                    float mediaLipidiosDiarios = (
                                            listaAlimentos.get(cardapioSegunda).getQuantidadeLipidios()
                                                    + listaAlimentos.get(cardapioTerca).getQuantidadeLipidios()
                                                    + listaAlimentos.get(cardapioQuarta).getQuantidadeLipidios()
                                                    + listaAlimentos.get(cardapioSQuinta).getQuantidadeLipidios()
                                                    + listaAlimentos.get(cardapioSexta).getQuantidadeLipidios()
                                    ) / 5;

                                    String informacaoNutricionaSemanal =
                                            "Proteínas: " + mediaProteinasDiarias + "g, " +
                                            "Carboidratos: " + mediaCarboidratosDiarios + "g, " +
                                            "Lipídios: " + mediaLipidiosDiarios + "g, ";

                                    CardapioSemanal novoCardapioSemanal = new CardapioSemanal(
                                            listaAlimentos.get(cardapioSegunda),
                                            listaAlimentos.get(cardapioTerca),
                                            listaAlimentos.get(cardapioQuarta),
                                            listaAlimentos.get(cardapioSQuinta),
                                            listaAlimentos.get(cardapioSexta),
                                            informacaoNutricionaSemanal
                                    );

                                    switch (semanaCardapio) {
                                        case 1: {
                                            cardapioMensalAux.setSemana1(novoCardapioSemanal);

                                            break;
                                        }
                                        case 2: {
                                            cardapioMensalAux.setSemana2(novoCardapioSemanal);

                                            break;
                                        }
                                        case 3: {
                                            cardapioMensalAux.setSemana3(novoCardapioSemanal);

                                            break;
                                        }
                                        case 4: {
                                            cardapioMensalAux.setSemana4(novoCardapioSemanal);

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
                                    int checkinsCincoDias = 0, checkinTrintaDias = 0, checkinTresMeses = 0;
                                    int cadastrosCincoDias = 0, cadastrosTrintaDias = 0, cadastrosTresMeses = 0;
                                    LocalDate dataCincoDiasAtras = LocalDate.now().minusDays(5);
                                    LocalDate dataTrintaDiasAtras = LocalDate.now().minusDays(30);
                                    LocalDate dataTresMesesAtras = LocalDate.now().minusMonths(3);

                                    for (LocalDate data : listaDataCheckin) {
                                        if (data.isAfter(dataCincoDiasAtras) || data.isEqual(dataCincoDiasAtras)) {
                                            checkinsCincoDias++;
                                        }
                                        if (data.isAfter(dataTrintaDiasAtras) || data.isEqual(dataTrintaDiasAtras)) {
                                            checkinTrintaDias++;
                                        }
                                        if (data.isAfter(dataTresMesesAtras) || data.isEqual(dataTresMesesAtras)) {
                                            checkinTresMeses++;
                                        }
                                    }

                                    for (LocalDate data : listaDataCadastro) {
                                        if (data.isAfter(dataCincoDiasAtras) || data.isEqual(dataCincoDiasAtras)) {
                                            cadastrosCincoDias++;
                                        }
                                        if (data.isAfter(dataTrintaDiasAtras) || data.isEqual(dataTrintaDiasAtras)) {
                                            cadastrosTrintaDias++;
                                        }
                                        if (data.isAfter(dataTresMesesAtras) || data.isEqual(dataTresMesesAtras)) {
                                            cadastrosTresMeses++;
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null,
                                            "RELATÓRIO DE CHECK-INS E CADASTROS NO SISTEMA" +
                                                    "\n" +
                                                    "-----------------------------------------------------------------------------" +
                                                    "\n\n" +
                                                    "Número total de check-ins realizados: " + numeroCheckins +
                                                    "\nNúmero de check-ins realizados até 5 dias " +
                                                    "atrás: " + checkinsCincoDias +
                                                    "\nNúmero de check-ins realizados até 30 dias" +
                                                    "atrás: " + checkinTrintaDias +
                                                    "\nNúmero de check-ins realizados até 3 meses" +
                                                    "atrás: " + checkinTrintaDias +
                                                    "\n\n" +
                                                    "Número total de cadastros realizados: " + numeroCadastros +
                                                    "\nNúmero de cadastros realizados até 5 dias " +
                                                    "atrás: " + cadastrosCincoDias +
                                                    "\nNúmero de cadastros realizados até 30 dias" +
                                                    " atrás: " + cadastrosTrintaDias +
                                                    "\nNúmero de check-ins realizados até 3 meses" +
                                                    " atrás: " + cadastrosTresMeses
                                    );

                                    break;
                                }
                                default: {
                                    admOpcao = 0;

                                    break;
                                }
                            }
                        }



                    } else {
                        JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos!");
                    }

                    break;
                }
                case 2: {
                    cmsOpcao = 99;

                    while (cmsOpcao != 0) {
                        cmsOpcao = Integer.parseInt(JOptionPane.showInputDialog(
                                " 0- Voltar para o menu principal\n " +
                                        "1- Fazer check-in\n " +
                                        "2- Fazer recarga do cartão\n " +
                                        "3- Visualizar Cardápio\n")
                        );

                        switch (cmsOpcao) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                int opcaoCheckin = 0;
                                boolean cpfEncontrado = false;

                                String cpfCheckin = JOptionPane.showInputDialog("Digite seu " +
                                        "CPF:\n Dica: caso não tenha feito seu cadastro, tente " +
                                        "'987654321'");

                                for (Comensal comensal : listaComensais) {
                                    if (comensal.getCpf().equals(cpfCheckin)) {
                                        cpfEncontrado = true;

                                        while (opcaoCheckin != 1 && opcaoCheckin != 2) {
                                            opcaoCheckin = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Nome: " + comensal.getNome() +
                                                            "\nMatrícula: " + comensal.getMatricula() +
                                                            "\nSaldo do cartão: " + comensal.getSaldoCartao() +
                                                            "\n\nDeseja fazer check-in? (-10 créditos)" +
                                                            "\n1- Sim" +
                                                            "\n2- Não"
                                            ));

                                            if (opcaoCheckin == 1 && comensal.getSaldoCartao() >= 10) {
                                                comensal.usoCartao(10);

                                                numeroCheckins++;
                                                listaDataCheckin.add(LocalDate.now());

                                                JOptionPane.showMessageDialog(null,"Check-in realizado!\n" +
                                                        "Saldo atual do cartão: " + comensal.getSaldoCartao() + " créditos");

                                            } else if (opcaoCheckin == 1 && comensal.getSaldoCartao() < 10) {
                                                JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente " +
                                                        "para " +
                                                        "fazer check-in");
                                            } else if (opcaoCheckin == 2) {
                                                break;
                                            }
                                        }

                                        break;
                                    }
                                }

                                if (!cpfEncontrado) {
                                    JOptionPane.showMessageDialog(null, "CPF não encontrado na " +
                                            "lista de comensais.");
                                }

                                break;
                            }

                            case 2: {
                                boolean cpfEncontrado = false;
                                String cpfCheckin = JOptionPane.showInputDialog("Digite seu CPF:\n " +
                                        "Dica: caso não tenha feito seu cadastro, tente " +
                                        "'987654321'");

                                for (Comensal comensal : listaComensais) {
                                    if (comensal.getCpf().equals(cpfCheckin)) {
                                        cpfEncontrado = true;

                                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da " +
                                                "recarga:"));
                                        comensal.recargaCartao(valor);

                                        break;
                                    }
                                }

                                if (!cpfEncontrado) {
                                    JOptionPane.showMessageDialog(null, "CPF não encontrado na " +
                                            "lista de comensais.");
                                }

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

                    Comensal novoCadastroComensal = new Comensal(nome,
                            cpf,
                            email,
                            dataNascimento,
                            matricula,
                            0);
                    listaComensais.add(novoCadastroComensal);

                    numeroCadastros++;
                    listaDataCadastro.add(LocalDate.now());
                    JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado(a) com sucesso!");

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
