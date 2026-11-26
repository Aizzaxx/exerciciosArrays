import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        // Estoque por loja
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5]; // 3 lojas (linhas) x 5 produtos (colunas)
        int[] totalPorLoja = new int[3];
        int[] totalPorProduto = new int[5];

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Loja " + (i + 1) + " - quantidade do produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
                totalPorLoja[i] += estoque[i][j];
                totalPorProduto[j] += estoque[i][j];
            }
        }

        System.out.println("\nTotal de produtos por loja:");
        int lojaComMaisEstoque = 0;
        for (int i = 0; i < totalPorLoja.length; i++) {
            System.out.println("Loja " + (i + 1) + ": " + totalPorLoja[i]);
            if (totalPorLoja[i] > totalPorLoja[lojaComMaisEstoque]) {
                lojaComMaisEstoque = i;
            }
        }

        System.out.println("\nTotal de cada produto (somando todas as lojas):");
        for (int j = 0; j < totalPorProduto.length; j++) {
            System.out.println("Produto " + (j + 1) + ": " + totalPorProduto[j]);
        }

        System.out.println("\nLoja com mais produtos no estoque: Loja " + (lojaComMaisEstoque + 1));
        scanner.close();
    }
}
