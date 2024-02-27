import java.text.DecimalFormat;
import java.util.Scanner;

public class atvd12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe sua altura: ");
        double altura = leitor.nextDouble();

        double peso_ideal_homen = (72.7 * altura) - 58;
        System.out.println("seu peso ideal é: " + peso_ideal_homen + "kg");
        double peso_ideal_mulher = (62.1 * altura) - 44.7;
        System.out.println("seu peso ideal como mulher é: " + peso_ideal_mulher + ("kg"));
    }    
}
