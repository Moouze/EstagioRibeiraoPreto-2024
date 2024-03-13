package Questoes;
import java.util.Scanner;

public class Problema2 {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}





