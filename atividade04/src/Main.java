package principal;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algo:");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("Tipo primitivo: int");
            System.out.println("Valor: " + num);
            System.out.println("Tamanho em bytes: " + Integer.BYTES);
            System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
            System.out.println("Valor máximo: " + Integer.MAX_VALUE);
        } else if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            System.out.println("Tipo primitivo: double");
            System.out.println("Valor: " + num);
            System.out.println("Tamanho em bytes: " + Double.BYTES);
            System.out.println("Valor mínimo normalizado: " + Double.MIN_NORMAL);
            System.out.println("Valor mínimo: " + Double.MIN_VALUE);
            System.out.println("Valor máximo: " + Double.MAX_VALUE);
        } else if (scanner.hasNextBoolean()) {
            boolean bool = scanner.nextBoolean();
            System.out.println("Tipo primitivo: boolean");
            System.out.println("Valor: " + bool);
        } else {
            String input = scanner.next();
            System.out.println("Tipo primitivo: String");
            System.out.println("Valor: " + input);
            System.out.println("Tamanho em bytes: " + input.getBytes().length);
        }

        scanner.close();
    }
}
