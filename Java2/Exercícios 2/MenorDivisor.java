import java.util.Scanner;

public class MenorDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int MenorDivisor = calcularMenorDivisor(numero);

        System.out.println("O Menor divisor de " + numero + " é: " + MenorDivisor);
    }

    public static int calcularMenorDivisor(int numero) {
        int MenorDivisor = 1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                MenorDivisor = i;
            }
        }

        return MenorDivisor;
    }
}