import java.util.Scanner;

public class MaiorDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int maiorDivisor = calcularMaiorDivisor(numero);

        System.out.println("O maior divisor de " + numero + " é: " + maiorDivisor);
    }

    public static int calcularMaiorDivisor(int numero) {
        int maiorDivisor = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                maiorDivisor = i;
            }
        }

        return maiorDivisor;
    }
}