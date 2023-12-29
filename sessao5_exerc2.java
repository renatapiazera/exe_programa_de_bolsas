import java.util.Scanner;

public class sessao5_exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        if (numero == 0) {
            System.out.println("Zero é considerado par.");
        }
        else {
            if (numero % 2 == 0) {
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
        }
    }
}
