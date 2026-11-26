import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        // Multiplicar matriz por um número
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\nMatriz multiplicada por " + multiplicador + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((matriz[i][j] * multiplicador) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
