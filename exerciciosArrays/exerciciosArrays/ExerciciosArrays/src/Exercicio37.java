import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        // Média de cada aluno (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double[][] notas = new double[4][3]; // 4 alunos (linhas) x 3 notas (colunas)

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Aluno " + (i + 1) + " - digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf(Locale.US, "Média do aluno %d: %.2f%n", (i + 1), media);
        }

        scanner.close();
    }
}
