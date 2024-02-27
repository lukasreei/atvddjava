import java.util.Scanner;
import math.round;


public class atvd7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe quanto você ganha por hora: ");
        int valor_hora = leitor.nextInt();

        System.out.println("informe quantas horas você trabalha: ");
        int horas = leitor.nextInt();

        int ganha = valor_hora * horas;
        System.out.println("seu salario é: R$ " + ganha);
    
    
    }
}
