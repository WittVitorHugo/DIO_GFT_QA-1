package br.com.dio.Desafios_1_Intermediario;

/**
 * Desafio
 * Crie um programa onde você receberá valores inteiros não negativos como entrada.
 *
 * Ordene estes valores de acordo com o seguinte critério:
 *
 * Primeiro os Pares
 * Depois os Ímpares
 * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoParesImpares {

    public static List<Integer> Ordenando(List<Integer> lista) {

        List<Integer> listaOrganizada = new ArrayList<>();

        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i) %2==0) listaOrganizada.add(lista.get(i));
        }

        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)%2==1) listaOrganizada.add(lista.get(i));
        }

        return listaOrganizada;
    }

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();
        List<Integer> listaNumeros = new ArrayList<>();

        for(int i=0; i<counter; i++) {
            int numero = input.nextInt();
            if (numero > 1 && numero <= 10000) listaNumeros.add(numero);
        }

        Collections.sort(listaNumeros);

        for (int i=0; i<listaNumeros.size(); i++){
            System.out.println(Ordenando(listaNumeros).get(i));
        }



    }
}