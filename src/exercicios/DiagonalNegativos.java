package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numOrdem;
        int numNegativos = 0;

        System.out.print("Qual a ordem da matriz? ");
        numOrdem = sc.nextInt();

        int[][] matriz = new int[numOrdem][numOrdem];


        for (int i = 0; i < numOrdem; i++){
            for (int j = 0; j < numOrdem; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] < 0){
                    numNegativos++;
                }
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < numOrdem; i++){
            for (int j = 0; j < numOrdem; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + "  ");
                }
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS: " + numNegativos);

        sc.close();
    }
}
