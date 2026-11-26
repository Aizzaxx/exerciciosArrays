import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        // Sistema simples de estoque
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
            System.out.print("Digite a quantidade em estoque de " + produtos[i] + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine(); // consome o ENTER que sobrou após o número
        }

        System.out.println("\nProdutos com estoque abaixo de 5 unidades:");
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println(produtos[i] + " - " + quantidades[i] + " unidade(s)");
            }
        }

        scanner.close();
    }
}
