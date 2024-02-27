import java.uti;
import java.util.Scanner;

import math.PI;

public class atvd6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor dos lados: ");
        int lado = leitor.nextInt();

        int area = lado * lado;
        System.out.println("o valor da área é: " + area);

        int dobro_area = area * area;
        System.out.println("o dobro da área é:" + dobro_area);

    }


}