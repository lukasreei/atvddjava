import java.util.Scanner;

class atvd1{
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero01 = leitor.nextInt();

        System.out.println("digite o segundo numero: ");
        int numero02 = leitor.nextInt();

        int soma = numero01 + numero02;
        System.out.println("a soma deles é: " + soma);
    }
}