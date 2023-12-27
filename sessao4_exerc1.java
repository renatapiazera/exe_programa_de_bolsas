import java.util.Scanner;

public class sessao4_exerc1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o primeiro valor: ");
        int a = entrada.nextInt();
        System.out.print("Qual o segundo valor: ");
        int b = entrada.nextInt();
        int soma = a + b;
        System.out.println("A soma entre " + a + " e " + b + " fica: " + soma);


    }
}
