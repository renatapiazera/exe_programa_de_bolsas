import java.util.Scanner;

public class sessao4_exerc4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do funcionário: ");
        int codigo = entrada.nextInt();
        System.out.print("Horas trabalhadas: ");
        int horas = entrada.nextInt();
        System.out.print("Valor por hora trabalhada: ");
        double valor = entrada.nextDouble();

        double salario = horas * valor;

        System.out.printf("Funcionário código %d%n", codigo);
        System.out.printf("Salário R$ %.2f ", salario);
    }
}
