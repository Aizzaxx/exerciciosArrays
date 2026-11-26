import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        // Relatório de alunos (use ponto nas notas decimais, ex.: 7.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // consome o ENTER que sobrou após a nota
        }

        System.out.println("\n===== RELATÓRIO =====");
        for (int i = 0; i < nomes.length; i++) {
            String situacao;
            if (notas[i] >= 7) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.println(nomes[i] + " | Nota: " + notas[i] + " | " + situacao);
        }

        scanner.close();
    }
}
