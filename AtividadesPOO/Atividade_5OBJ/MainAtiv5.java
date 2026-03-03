package AtividadesPOO.Atividade_5OBJ;
import AtividadesPOO.Atividade_5OBJ.Contato;
import AtividadesPOO.Atividade_5OBJ.Agenda;
import java.util.Scanner;

public class MainAtiv5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;

        do {
            System.out.println("\n===== AGENDA =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Buscar por email");
            System.out.println("5 - Buscar por telefone");
            System.out.println("6 - Consultar tamanho da agenda");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // limpar buffer do enter

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();

                    System.out.print("Email: ");
                    String email = input.nextLine();

                    System.out.print("Telefone: ");
                    int telefone = input.nextInt();
                    input.nextLine();

                    Contato novo = new Contato(nome, email, telefone);
                    agenda.adicionarContato(novo);

                    System.out.println("Contato adicionado!");
                    break;

                case 2:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = input.nextLine();

                    boolean removido = agenda.removerContato(nomeRemover);

                    if (removido) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nome para busca: ");
                    String nomeBusca = input.nextLine();

                    Contato c1 = agenda.buscarPorNome(nomeBusca);

                    if (c1 != null) {
                        mostrarContato(c1);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Email para busca: ");
                    String emailBusca = input.nextLine();

                    Contato c2 = agenda.buscarPorEmail(emailBusca);

                    if (c2 != null) {
                        mostrarContato(c2);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Telefone para busca: ");
                    int telBusca = input.nextInt();
                    input.nextLine();

                    Contato c3 = agenda.buscarPorTelefone(telBusca);

                    if (c3 != null) {
                        mostrarContato(c3);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Total de contatos: " + agenda.getTamanhoListaContatos());
                    break;

                case 7:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        input.close();
    }

    // método auxiliar para imprimir contato
    public static void mostrarContato(Contato c) {
        System.out.println("----- CONTATO -----");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Telefone: " + c.getTelefone());
    }
}