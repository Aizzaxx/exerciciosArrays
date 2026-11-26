import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        // Comparar dois arrays
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        boolean iguais = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
            }
        }

        if (iguais) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("Os arrays são diferentes.");
        }

        scanner.close();
    }
}
