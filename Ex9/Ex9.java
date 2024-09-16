/******************************************************************************

Escreva um programa que receba dois números x e y e calcule xy

. Sem utilizar a biblioteca

Math.

*******************************************************************************/
import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int x, y, i, resultado = 1;
	    
		System.out.println("Digite um valor para X: ");
		x = sc.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		y = sc.nextInt();
		
        for(i = 0; i < y; i++ ) {
            resultado *= x;
        }
		
		System.out.println(x + " elevado a " + y + ": " + resultado);
		
	}
}
