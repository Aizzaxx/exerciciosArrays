import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        // Contar nomes que começam com a letra A
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            // toUpperCase faz "ana" e "Ana" contarem do mesmo jeito
            if (!nomes[i].isEmpty() && Character.toUpperCase(nomes[i].charAt(0)) == 'A') {
                contador++;
            }
        }

        System.out.println("Nomes que começam com A: " + contador);
        scanner.close();
    }
}
