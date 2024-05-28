package Lista_de_exercicios3;
import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Os números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

    }
}

