import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        // Vendas por vendedor (use ponto nos valores decimais, ex.: 150.50)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[][] vendas = new double[3][4]; // 3 vendedores (linhas) x 4 vendas (colunas)
        double[] totais = new double[3];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Vendedor " + (i + 1) + " - valor da venda " + (j + 1) + ": ");
                vendas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();
        int melhorVendedor = 0;
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totais[i] += vendas[i][j];
            }
            System.out.printf(Locale.US, "Total do vendedor %d: R$ %.2f%n", (i + 1), totais[i]);

            if (totais[i] > totais[melhorVendedor]) {
                melhorVendedor = i;
            }
        }

        System.out.println("O vendedor que mais vendeu foi o vendedor " + (melhorVendedor + 1));
        scanner.close();
    }
}
