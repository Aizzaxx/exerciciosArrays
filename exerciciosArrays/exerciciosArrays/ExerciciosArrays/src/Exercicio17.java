import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        // Aprovados e reprovados (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[] notas = new double[8];
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        scanner.close();
    }
}
