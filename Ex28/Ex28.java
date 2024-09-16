/******************************************************************************

Faça um programa que calcule o Arranjo e Combinação de N tomados de P a P, An
p
e

Cn
p
. Para tal, crie um método que calcule o fatorial de um número. Crie também outros

dois métodos, uma para calcular An
p
e outra para calcular Cn
p
conforme as equações

abaixo, e ao final mostre os resultados.

*******************************************************************************/

import java.util.Scanner;

public class Ex28 {
    
    public static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    
    public static int arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }
    
    public static int combinacao(int n, int p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, p = 0, resultado = 0;

        System.out.println("Fatorial: ");
        do {
            System.out.println("Digite o número que deseja saber o fatorial: ");
            n = sc.nextInt();
            sc.nextLine();
            
            if(n < 0) {
                System.out.println("O número deve ser inteiro. Digite novamente:");
            } else {
                resultado = fatorial(n);
                System.out.println("Fatorial de " + n + " = " + resultado);
            }
        }while(n < 0);


        System.out.println("Arranjo: ");
        do {
            System.out.println("Digite o número total de elementos: ");
            n = sc.nextInt();
            sc.nextLine();
            
            if(n < 0) 
                System.out.println("O número deve ser inteiro. Digite novamente:");
            
        }while(n < 0);
        
        do {
            System.out.println("Digite o número de elementos que deseja organizar: ");
            p = sc.nextInt();
            sc.nextLine();
            
            if(p < 0) {
                System.out.println("Número negativo não é válido para arranjo. Tente novamente.");
            } else if(p > n) {
                System.out.println("Número de elementos para organizar não pode ser maior que o total de elementos. Tente novamente.");
            } else {
                resultado = arranjo(n, p);
                System.out.println("Arranjo de " + n + " elementos tomados " + p + " de cada vez é " + resultado);
            }
        }while(n < 0 || p < 0 || p > n);
        
        

        System.out.println("Combinação: ");
        do {
            System.out.println("Digite o número total de elementos: ");
            n = sc.nextInt();
            sc.nextLine();
            
            if(n < 0) 
                System.out.println("O número deve ser inteiro. Digite novamente:");
                
        }while(n < 0);
            
        do{
            
            System.out.println("Digite o número de elementos que deseja escolher: ");
            p = sc.nextInt();
            sc.nextLine();
            
            if(p < 0) {
                System.out.println("O número deve ser inteiro. Digite novamente:");
            } else if(p > n) {
                System.out.println("Escolha um número menor que o total de elementos. Digite novamente:");
            } else {
                resultado = combinacao(n, p);
                System.out.println("Combinação de " + n + " e " + p + " = " + resultado);
            }
        }while (n < 0 || p < 0 || p > n);
    }
}
