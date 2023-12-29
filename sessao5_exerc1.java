import java.util.Scanner;

public class sessao5_exerc1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

    }
}