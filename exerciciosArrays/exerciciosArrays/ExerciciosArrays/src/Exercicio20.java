import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        // Verificar número repetido
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }
        }

        if (repetido) {
            System.out.println("Existe pelo menos um número repetido.");
        } else {
            System.out.println("Não existem números repetidos.");
        }

        scanner.close();
    }
}
