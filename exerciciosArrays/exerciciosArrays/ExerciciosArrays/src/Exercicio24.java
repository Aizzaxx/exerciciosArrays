import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        // Somar apenas os pares
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }

        System.out.println("Soma dos números pares: " + soma);
        scanner.close();
    }
}
