/******************************************************************************
 * 
Faça um programa que leia um numero inteiro N e mostre todos os números primos entre
1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo.
Ex. 17 é um número primo, pois só é divisível por 1 e por ele mesmo.

*******************************************************************************/
import java.util.Scanner;


public class Ex16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, num;
        
        do {
            System.out.println("Digite um número inteiro: ");
            n = sc.nextInt();
            
            if(n < 0) 
                System.out.println("O número deve ser inteiro. Digite novamente: ");
        }while(n < 0);

        System.out.println("Números primos entre 1 e " + n + ":");

        for (num = 2; num <= n; num++) {
            int divisor;
            for (divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    break; 
                }
            }

            if (divisor == num) {
                System.out.print(num + " ");
            }
        }

    }
}
