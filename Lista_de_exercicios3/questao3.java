package Lista_de_exercicios3;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int num8;
        int num9;
        int num10;

        System.err.println("Digite 10 números");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        num6 = scan.nextInt();
        num7 = scan.nextInt();
        num8 = scan.nextInt();
        num9 = scan.nextInt();
        num10 = scan.nextInt();
        System.out.println("Os seguintes números são pares");
       if (num1 %2 ==0) {
            System.out.println(num1);
       } 
       else System.out.println();
       if (num2 %2 ==0) {
            System.out.println(num2);
       }
       else System.out.println();
       if (num3 %2 ==0) {
        System.out.println(num3);
        }
        else System.out.println();
        if (num4 %2 ==0) {
            System.out.println(num4);
       }
       else System.out.println();
       if (num5 %2 ==0) {
        System.out.println(num5);
        }
        else System.out.println();
        if (num6 %2 ==0) {
            System.out.println(num6);
        }
        else System.out.println();
        if (num7 %2 ==0) {
            System.out.println(num7);
       }
       else System.out.println();
       if (num8 %2 ==0) {
        System.out.println(num8);
        }
        else System.out.println();
       if (num9 %2 ==0) {
        System.out.println(num9);
        }
        else System.out.println();
        if (num10 %2 ==0) {
            System.out.println(num10);
        }
        else System.out.println();
        scan.close();    
    }
}
