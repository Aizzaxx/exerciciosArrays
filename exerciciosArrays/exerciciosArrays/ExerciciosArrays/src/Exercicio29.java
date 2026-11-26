import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        // Menu de busca
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Listar todos os produtos");
            System.out.println("2 - Buscar produto pelo nome");
            System.out.println("3 - Mostrar quantidade de produtos cadastrados");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consome o ENTER que sobrou após o número

            switch (opcao) {
                case 1:
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i]);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < produtos.length; i++) {
                        if (busca.equals(produtos[i])) {
                            encontrado = true;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Produto encontrado!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de produtos: " + produtos.length);
                    break;
                case 4:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
