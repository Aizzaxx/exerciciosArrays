import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        // Diagonal principal
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}
