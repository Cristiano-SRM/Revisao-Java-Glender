package AtividadesPOO.Atividade_6OBJ;
import AtividadesPOO.Atividade_6OBJ.Pessoa;
import AtividadesPOO.Atividade_6OBJ.ArvoreGenealogica;
import java.util.List;
import java.util.Scanner;

public class MainAtiv6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArvoreGenealogica arvore = new ArvoreGenealogica();

        int opcao;

        do {
            System.out.println("\n===== ÁRVORE GENEALÓGICA =====");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Verificar irmandade");
            System.out.println("3 - Buscar filhos");
            System.out.println("4 - Buscar irmãos");
            System.out.println("5 - Buscar pessoa");
            System.out.println("6 - Remover pessoa");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome da pessoa: ");
                    String nome = input.nextLine();

                    System.out.print("Nome do pai (ou vazio): ");
                    String nomePai = input.nextLine();
                    Pessoa pai = null;
                       if (!nomePai.isEmpty()) {
                         pai = arvore.buscarPessoa(nomePai);
                         if (pai == null) {
                          pai = new Pessoa(nomePai, null, null);
                          arvore.adicionarPessoa(pai);
                     }
}

                    System.out.print("Nome da mãe (ou vazio): ");
                    String nomeMae = input.nextLine();
                    Pessoa mae = null;
                       if (!nomeMae.isEmpty()) {
                         mae = arvore.buscarPessoa(nomeMae);
                         if (mae == null) {
                         mae = new Pessoa(nomeMae, null, null);
                         arvore.adicionarPessoa(mae);
                     }
}

                    Pessoa nova = new Pessoa(nome, pai, mae);
                    arvore.adicionarPessoa(nova);

                    System.out.println("Pessoa adicionada.");
                    break;

                case 2:
                    System.out.print("Primeira pessoa: ");
                    Pessoa p1 = arvore.buscarPessoa(input.nextLine());

                    System.out.print("Segunda pessoa: ");
                    Pessoa p2 = arvore.buscarPessoa(input.nextLine());

                    if (p1 == null || p2 == null) {
                        System.out.println("Pessoa não encontrada.");
                    } else if (p1.ehIrmaoDe(p2)) {
                        System.out.println("São irmãos.");
                    } else {
                        System.out.println("Não são irmãos.");
                    }
                    break;

                case 3:
                    System.out.print("Nome do pai/mãe: ");
                    Pessoa p = arvore.buscarPessoa(input.nextLine());

                    if (p == null) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        List<Pessoa> filhos = arvore.buscarFilhos(p);
                        System.out.println("Filhos:");
                        for (Pessoa f : filhos) {
                            System.out.println(f.getNome());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nome da pessoa: ");
                    Pessoa pessoa = arvore.buscarPessoa(input.nextLine());

                    if (pessoa == null) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        List<Pessoa> irmaos = arvore.buscarIrmaos(pessoa);
                        System.out.println("Irmãos:");
                        for (Pessoa i : irmaos) {
                            System.out.println(i.getNome());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nome da pessoa: ");
                    Pessoa pessoaBusca = arvore.buscarPessoa(input.nextLine());

                    if (pessoaBusca == null) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.println("Nome: " + pessoaBusca.getNome());
                        System.out.println("Pai: " +
                                (pessoaBusca.getPai() != null ? pessoaBusca.getPai().getNome() : "Desconhecido"));
                        System.out.println("Mãe: " +
                                (pessoaBusca.getMae() != null ? pessoaBusca.getMae().getNome() : "Desconhecida"));
                    }
                    break;

                case 6:
                    System.out.print("Nome da pessoa a remover: ");
                    if (arvore.removerPessoa(input.nextLine())) {
                        System.out.println("Removida.");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 7:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        input.close();
    }
}