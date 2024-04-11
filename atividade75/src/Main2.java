import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[4];

        // Lendo os valores
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextInt();
        }

        // Contando quantas vezes o valor 9 apareceu
        int vezesNove = 0;
        for (int valor : valores) {
            if (valor == 9) {
                vezesNove++;
            }
        }
        System.out.println("O valor 9 apareceu " + vezesNove + " vezes.");

        // Encontrando a posição do primeiro valor 3
        int posicaoValorTres = -1;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 3) {
                posicaoValorTres = i + 1;
                break;
            }
        }
        if (posicaoValorTres != -1) {
            System.out.println("O primeiro valor 3 foi digitado na posição " + posicaoValorTres + ".");
        } else {
            System.out.println("O valor 3 não foi digitado.");
        }

        // Mostrando os números pares
        System.out.print("Os números pares digitados foram: ");
        for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }
    }
}
