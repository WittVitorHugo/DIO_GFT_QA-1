package br.com.dio.Desafios_1_Intermediario;

/**
 * Entrada
 * A entrada contém vários casos de teste. Cada caso contém uma linha com o número N (1 ≤ N ≤ 106). É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja utilizando a técnica (incluindo o original).
 *
 * Saída
 * Para cada caso de teste, imprima uma linha contendo o número de vezes que a técnica foi utilizada.
 */

import java.util.Scanner;

public class KageBunshinNoJutsu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNext()) {
            i = sc.nextInt();

            System.out.println(i / 2);
        }

    }
}
