import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        // Contar pares na matriz
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        scanner.close();
    }
}
