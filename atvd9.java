import java.util.Scanner;
import java.math;


public class atvd9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a temperatura em celsius: ");
        double celsius = leitor.nextDouble();

        double F = ( celsius * 9/5) + 32;
        System.out.println("a temperatura em F é: " + F);
    }
}
