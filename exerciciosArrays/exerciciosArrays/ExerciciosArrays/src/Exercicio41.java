import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        // Diagonal secundária
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal secundária:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Na diagonal secundária, linha + coluna = tamanho - 1
                if (i + j == matriz.length - 1) {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}
