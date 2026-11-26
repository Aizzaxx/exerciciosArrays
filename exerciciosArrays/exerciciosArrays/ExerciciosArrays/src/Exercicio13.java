import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Contar repetição de um número
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja pesquisar: ");
        int pesquisado = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisado) {
                contador++;
            }
        }

        System.out.println("O número " + pesquisado + " apareceu " + contador + " vez(es).");
        scanner.close();
    }
}
