import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Notas acima da média (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf(Locale.US, "Média: %.2f%n", media);

        System.out.println("Notas acima da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        scanner.close();
    }
}
