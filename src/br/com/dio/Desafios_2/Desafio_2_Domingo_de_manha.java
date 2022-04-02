package br.com.dio.Desafios_2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal.
 * Diga o atraso máximo de Bino.
 * Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas),
 * X indica o atraso maximo (em minutos) de Bino no encontro com Cino.
 */

public class Desafio_2_Domingo_de_manha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            int atraso = 0;
            if(hora >= 7) {
                atraso = (hora - 7) * 60 + min;
            }
            System.out.println("Atraso maximo: " + atraso);

        }
    }
}
