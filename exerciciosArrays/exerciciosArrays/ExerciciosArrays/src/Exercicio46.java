import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        // Trocar coluna 0 com coluna 2
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Troca linha por linha
        for (int i = 0; i < matriz.length; i++) {
            int temporario = matriz[i][0];
            matriz[i][0] = matriz[i][2];
            matriz[i][2] = temporario;
        }

        System.out.println("\nMatriz após a troca das colunas 0 e 2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
