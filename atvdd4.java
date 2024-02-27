import java.util.Scanner;

public class atvdd4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor em metros: ");
        double metros = leitor.nextDouble();
       
        double cetimentros = metros * 100;

        System.out.println("seu valor em cetimetros é: " + cetimentros);

    }
}
