import java.util.Scanner;

public class sessao4_exerc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código da peça: ");
        int peca1 = entrada.nextInt();
        System.out.print("Peça cod: " + peca1 + ". Quantidade: ");
        int quant = entrada.nextInt();
        System.out.print("Peça cod: " + peca1 + ". Preço unitário: R$ ");
        double preco = entrada.nextDouble();

        double total = preco * quant;

        System.out.printf("Valor a pagar: R$ %.2f ", total);
    }
}
