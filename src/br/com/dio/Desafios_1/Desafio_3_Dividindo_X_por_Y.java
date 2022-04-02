package br.com.dio.Desafios_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
 * Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.
 */

public class Desafio_3_Dividindo_X_por_Y {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if (Y == 0.0) System.out.println("divisao impossivel");
            else System.out.printf("%.1f %n", (double) X / Y);
        }
    }
}
