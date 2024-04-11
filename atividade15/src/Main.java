import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        System.out.println("Quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        double precoPorDia = 60.0;
        double precoPorKm = 0.15;

        double precoTotal = (precoPorDia * diasAluguel) + (precoPorKm * kmPercorridos);

        System.out.println("O preço a pagar é: R$" + precoTotal);

        scanner.close();
    }
}


