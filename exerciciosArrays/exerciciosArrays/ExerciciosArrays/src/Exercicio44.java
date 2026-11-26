import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        // Buscar valor na matriz
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número que deseja pesquisar: ");
        int pesquisado = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == pesquisado) {
                    System.out.println("Número encontrado na linha " + i + ", coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
