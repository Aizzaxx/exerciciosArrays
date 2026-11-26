import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // Contar pares
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        scanner.close();
    }
}
