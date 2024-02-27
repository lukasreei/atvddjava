import java.util.Scanner;
import java.math;

public class atvd5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o valor do raio: ");
        double raio = leitor.nextDouble();
    
        double pi = Math.PI;
        //System.out.println("o valor de Pi: " + pi);

        double area = pi *  raio * raio;
        System.out.println("o valor da area é " + area);
       // System.out.println("a area é: " + area);
    }

}