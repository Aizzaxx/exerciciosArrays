import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Buscar número e posição
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja buscar: ");
        int busca = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                System.out.println("Número encontrado na posição " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
