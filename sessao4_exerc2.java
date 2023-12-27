import java.util.Scanner;

public class sessao4_exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();

        double pi = 3.14159;
        double raio2 = Math.pow(raio, 2);
        double area = pi * raio2;
        System.out.printf("A área do círculo é de %.4f", area);

    }
}
