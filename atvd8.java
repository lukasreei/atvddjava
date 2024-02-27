import java.util.Scanner;
import java.math;

public class atvd8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o valor de graus F: ");
        double f = leitor.nextDouble();

        double celsius = 5 * ((f-32) / 9);
        System.out.println("o a temperatura em celsius é: " + celsius);
    }
}
