import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        // Matriz transposta
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                transposta[j][i] = matriz[i][j]; // linhas viram colunas
            }
        }

        System.out.println("\nMatriz original (2x3):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta (3x2):");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
