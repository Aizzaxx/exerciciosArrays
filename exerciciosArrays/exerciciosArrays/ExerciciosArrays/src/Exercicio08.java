import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // Contar ímpares
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + impares);
        scanner.close();
    }
}
