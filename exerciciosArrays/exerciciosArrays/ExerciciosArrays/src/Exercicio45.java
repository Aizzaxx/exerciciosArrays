import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        // Trocar linha 0 com linha 2
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Troca coluna por coluna
        for (int j = 0; j < matriz[0].length; j++) {
            int temporario = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temporario;
        }

        System.out.println("\nMatriz após a troca das linhas 0 e 2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
