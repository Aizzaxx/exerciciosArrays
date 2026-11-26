import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        // Soma da matriz
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os valores é: " + soma);
        scanner.close();
    }
}
