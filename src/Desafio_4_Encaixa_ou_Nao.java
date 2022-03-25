import java.util.Scanner;

/**
 * Verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.
 */

public class Desafio_4_Encaixa_ou_Nao {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();


        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            String str_a = String.valueOf(a);
            String str_b = String.valueOf(b);

            int lenght_a = str_a.length();
            int lenght_b = str_b.length();

            if (str_a.endsWith(str_b)) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }

    }
}
