import java.util.Locale;

public class exercicio1 {
    public static void main(String[] args){
        String produto1 = "Computador";
        String produto2 = "Escrivaninha";

        int idade = 38;
        int codigo = 190404;
        char genero = 'F';

        double preco1 = 2100.00;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.printf("O %s custa R$ %.2f.%n", produto1, preco1);
        System.out.printf("A %s custa R$ %.2f.%n", produto2, preco2);
        System.out.println("");
        System.out.printf("Registro: %d anos, código %d e gênero: %s%n", idade, codigo, genero);
        System.out.println("");
        System.out.printf("Com 8 casas decimais: %.8f%n", medida);
        System.out.printf("Com 3 casas decimais: %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Com 3 casas decimais e pontuação US: %.3f%n", medida);
    }
}
