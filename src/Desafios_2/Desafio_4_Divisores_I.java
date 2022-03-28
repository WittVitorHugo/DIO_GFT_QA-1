package Desafios_2;

import java.util.Scanner;

/**
 * Ler um número inteiro N e calcular todos os seus divisores.
 */

public class Desafio_4_Divisores_I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(n/(n/i));
            }
        }
        System.out.println();
    }

}
