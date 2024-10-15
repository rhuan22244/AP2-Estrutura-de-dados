import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaPedidos sistemaPedidos = new SistemaPedidos();
        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nEscolha o sistema:");
            System.out.println("1. Sistema de Pedidos (Pilha e Fila)");
            System.out.println("2. Sistema de Biblioteca (Lista Duplamente Ligada)");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    menuSistemaPedidos(sistemaPedidos, scanner);
                    break;
                case 2:
                    menuSistemaBiblioteca(sistemaBiblioteca, scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    public static void menuSistemaPedidos(SistemaPedidos sistemaPedidos, Scanner scanner) {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n--- Sistema de Pedidos ---");
            System.out.println("1. Adicionar Novo Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Restaurar Pedido");
            System.out.println("5. Imprimir Pedidos Pendentes");
            System.out.println("6. Voltar");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do pedido: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a descrição do pedido: ");
                    String descricao = scanner.nextLine();
                    sistemaPedidos.adicionarPedido(id, descricao);
                    break;
                case 2:
                    sistemaPedidos.atenderPedido();
                    break;
                case 3:
                    sistemaPedidos.cancelarPedido();
                    break;
                case 4:
                    sistemaPedidos.restaurarPedido();
                    break;
                case 5:
                    sistemaPedidos.imprimirPedidosPendentes();
                    break;
                case 6:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void menuSistemaBiblioteca(SistemaBiblioteca sistemaBiblioteca, Scanner scanner) {
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Adicionar Livro no Início");
            System.out.println("2. Adicionar Livro no Fim");
            System.out.println("3. Remover Primeiro Livro");
            System.out.println("4. Remover Último Livro");
            System.out.println("5. Buscar Livro por ID");
            System.out.println("6. Imprimir Livros na Ordem Original");
            System.out.println("7. Imprimir Livros na Ordem Reversa");
            System.out.println("8. Voltar");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    int idLivroInicio = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o título do livro: ");
                    String tituloInicio = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorInicio = scanner.nextLine();
                    sistemaBiblioteca.adicionarLivroNoInicio(idLivroInicio, tituloInicio, autorInicio);
                    break;
                case 2:
                    System.out.print("Digite o ID do livro: ");
                    int idLivroFim = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o título do livro: ");
                    String tituloFim = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorFim = scanner.nextLine();
                    sistemaBiblioteca.adicionarLivroNoFim(idLivroFim, tituloFim, autorFim);
                    break;
                case 3:
                    sistemaBiblioteca.removerPrimeiroLivro();
                    break;
                case 4:
                    sistemaBiblioteca.removerUltimoLivro();
                    break;
                case 5:
                    System.out.print("Digite o ID do livro: ");
                    int idLivroBusca = scanner.nextInt();
                    sistemaBiblioteca.buscarLivroPorId(idLivroBusca);
                    break;
                case 6:
                    sistemaBiblioteca.imprimirLivrosEmOrdem();
                    break;
                case 7:
                    sistemaBiblioteca.imprimirLivrosEmOrdemReversa();
                    break;
                case 8:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}