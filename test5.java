public class quinto_test {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = 5;

        double a = Math.sqrt(x);
        double b = Math.sqrt(y);
        double c = Math.sqrt(25);
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25 é: " + c);

        double d = Math.pow(x, y);
        double e = Math.pow(y, 2);
        double f = Math.pow(5, x);
        System.out.println(x + " elevado a " + y + " = " + d);
        System.out.println(y + " ao quadrado é: " + e);
        System.out.println("5 ao cubo é: " + f);

        double g = Math.abs(-8);
        double h = Math.abs(-19);
        System.out.println("O valor absoluto de -8 é: " + g);
        System.out.println("O valor absoluto de -19 é: " + h);

    }
}
