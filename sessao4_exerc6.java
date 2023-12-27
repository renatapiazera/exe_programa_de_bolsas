import java.util.Scanner;

public class sessao4_exerc6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double a = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double b = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double c = entrada.nextDouble();

        double triangulo = (a * c) / 2;
        double raio2 = Math.pow(c, 2);
        double circulo = 3.14159 * raio2;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = (a * b);

        System.out.printf("Triângulo Retângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);
    }
}
