/******************************************************************************

Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos!

*******************************************************************************/
import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n, i, fatorial = 1;
	    
		System.out.println("Digite o número que você deseja saber o fatorial: ");
		n = sc.nextInt();
		
		if(n < 0) {
		    System.out.println("Número inválido");
		    return;
		}
		
		if(n == 0) {
		    System.out.println("Fatorial de " + n + " é: " + fatorial);
		    return;
		}
		
		for(i = 1; i <= n; i++) {
		    fatorial *= i;
		}
		
		System.out.println("Fatorial de " + n + " é: " + fatorial);
		
	}
}
