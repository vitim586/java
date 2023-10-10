import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero : ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero : ");
        int b = scanner.nextInt();

        int product = a * b;
        System.out.println("Product: " + product);
    }
}
