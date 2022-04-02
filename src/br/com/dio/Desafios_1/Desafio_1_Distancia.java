package br.com.dio.Desafios_1;

import java.util.Scanner;

/**
 * @author Vitor Hugo Witt
 * Ler a distância (em Km) e calcular quanto tempo
 * leva (em minutos) para a moto Y tomar essa distância da moto X.
 */

public class Desafio_1_Distancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;  //insira as variáveis corretamente

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
