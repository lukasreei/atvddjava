import java.util.Scanner;

public class atvdd10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o primeiro numero inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.println("digite o segundo numero inteiro: ");
        int numero2 = leitor.nextInt();

        System.out.println("digite um numero real: ");
        double real = leitor.nextDouble();

        double resultado1 = (2 * numero1) + (2 / numero2);
        System.out.println("o resultado um é: " + resultado1);

        double resultado2 = (3 * numero1) + real;
        System.out.println("o resultado2 é: " + resultado2);

        double resultado3 = (real * 3);
        System.out.println("o resultado3 é: " + resultado3);

    }
}
