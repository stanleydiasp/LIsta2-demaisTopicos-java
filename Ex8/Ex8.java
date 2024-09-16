/******************************************************************************

Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as equações
abaixo:

*******************************************************************************/
import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int codigo, x, y;
	    double eq;
	    
		System.out.println("Digite um código de 1 a 4");
		codigo = sc.nextInt();
		
		if(codigo > 4) {
		    System.out.println("Código inválido");
		    return;
		}
		
		System.out.println("Digite um valor para X");
		x = sc.nextInt();
		
		System.out.println("Digite um valor para Y");
		y = sc.nextInt();
		
		if(codigo == 1) {
		    eq = Math.sqrt((Math.pow(x, 3) + (x * (2 * y - x))) / Math.pow(y,2));
		    System.out.println("f("+ x + "," + y + ") = " + eq);
		} 
		else if(codigo == 2) {
		    eq = Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / (x * y);
		    System.out.println("f("+ x + "," + y + ") = " + eq);
		}
		else if(codigo == 3) {
		    eq = (2 * x) + Math.sqrt(x * y);
		    System.out.println("f("+ x + "," + y + ") = " + eq);
		}
		else {
		    eq = Math.sin(x) + Math.cos(y);
		    System.out.println("f("+ x + "," + y + ") = " + eq);
		}
	}
}
