package Desafios_1;

import java.util.Scanner;

/**
 * Leia dois valores inteiros identificados como variáveis A e B.
 * Calcule a soma entre elas e chame essa variável de SOMA.
 * A seguir escreva o valor desta variável.
 */

public class Desafio_2_Soma_Simples {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}