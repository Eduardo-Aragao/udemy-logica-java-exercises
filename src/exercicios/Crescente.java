package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        do {
            System.out.println("Digite dois numeros:");
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();

            if (numero1 > numero2){
                System.out.println("DECRESCENTE!");
            } else if (numero1 < numero2) {
                System.out.println("CRESCENTE!");
            }

        } while (numero1 != numero2);

        System.out.println("números iguais, programa fechando...");


        sc.close();
    }
}
