package Lista_de_exercicios3;

import java.util.Scanner;
import java.util.Arrays;
public class questao2 {
        
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }

   
        Arrays.sort(vetor);

        System.out.println("Os números digitados, em ordem crescente,são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}


