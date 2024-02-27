import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a primeria nota: ");
        int nota1 = leitor.nextInt();

        System.out.println("digite a segunda nota: ");
        int nota2 = leitor.nextInt();

        System.out.println("digite a terceira nota: ");
        int nota3 = leitor.nextInt();

        System.out.println("digite a quarta nota: ");
        int nota4 = leitor.nextInt();

        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma / 4;
        System.err.println("a media das notas é: " + media);
    }
}
