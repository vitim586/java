import java.util.Scanner;

public class Soma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero : ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero : ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("A soma é: " + sum);
    }
}
