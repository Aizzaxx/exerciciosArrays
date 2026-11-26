import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        // Soma de cada linha
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0; // zera no começo de cada linha
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}
