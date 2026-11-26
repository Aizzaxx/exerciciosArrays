import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        // Soma de cada coluna
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int j = 0; j < matriz[0].length; j++) { // o for de fora controla a coluna
            int somaColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}
