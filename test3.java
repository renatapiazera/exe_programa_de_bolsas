import java.util.Scanner;

public class terceiro_test {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String nome = sc.next();
      int x = sc.nextInt();
      double y = sc.nextDouble();
      char z = sc.next().charAt(0);
      System.out.println("Você digitou: " + nome);
      System.out.println("O número inteiro é: " + x);
      System.out.printf("Você digitou: %.2f%n", y);
      System.out.println("Você digitou: " + z);
    }
}
