import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        // Boletim com nomes (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n===== BOLETIM =====");
        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;
            System.out.print(nomes[i] + " | Notas: ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            String situacao;
            if (media >= 7) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.printf(Locale.US, "| Média: %.2f | %s%n", media, situacao);
        }

        scanner.close();
    }
}
