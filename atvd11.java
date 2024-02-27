import java.util.Scanner;
import java.math;

public  class atvd11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a sua altura: ");
        double altura = leitor.nextDouble();

        double peso_ideal = (72.7*altura) - 58;
        System.out.println("seu peso ideal é: " + peso_ideal);







    }
}