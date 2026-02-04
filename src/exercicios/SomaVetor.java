package exercicios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main (String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "   ");
            soma = soma + vet[i];
        }

        /* ------------------------------------
           Versão alternativa usando for-each
           - Percorre o vetor sem precisar de índice

        for(double valor : vet){
            System.out.print(valor + "   ");
            soma += valor;
        }
        ------------------------------------ */

        double media = soma/n;

        System.out.println();
        System.out.printf("SOMA = %.2f", soma );
        System.out.println();
        System.out.printf("MEDIA = %.2f", media);


        sc.close();
    }
}
