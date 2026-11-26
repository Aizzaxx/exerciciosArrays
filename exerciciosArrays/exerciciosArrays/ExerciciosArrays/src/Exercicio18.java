import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        // Maior e menor nota (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[] notas = new double[6];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            soma += notas[i];
        }

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf(Locale.US, "Média da turma: %.2f%n", soma / notas.length);
        scanner.close();
    }
}
