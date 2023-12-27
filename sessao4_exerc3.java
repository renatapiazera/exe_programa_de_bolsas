import java.util.Scanner;

public class sessao4_exerc3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double a = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double b = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double c = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double d = entrada.nextDouble();

        double resultado = (a * b) - (c * d);
        System.out.printf("A diferença entre os produtos é: %.2f", resultado);
    }
}
