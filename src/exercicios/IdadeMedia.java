package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdadeMedia {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // --- Leitura da Pessoa 1 ---
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine(); //realiza a limpeza de buffer

        System.out.println();

        // --- Leitura da Pessoa 2 ---
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();
        sc.nextLine(); //realiza a limpeza de buffer

        // --- Processamento + casting ---
        double idadeMedia = (double) (idade1 + idade2)/2;

        // --- Saída ---
        System.out.printf(
                "A idade media de %s e %s eh de %.1f anos",
                nome1, nome2, idadeMedia
                );


        sc.close();
    }
}
