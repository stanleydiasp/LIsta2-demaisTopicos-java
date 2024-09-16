/******************************************************************************

Escreva um algoritmo que leia o código de um determinado produto e mostre a sua
classificação de acordo com a tabela apresentada a seguir:

*******************************************************************************/
import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int codigo;
	    
		System.out.println("Digite o código do produto: ");
		codigo = sc.nextInt();
		
	    if(codigo == 1)
	       System.out.println("Alimento não-perecível");
        else if(codigo >= 2 && codigo <= 4)
		        System.out.println("Alimento perecível");
		else if(codigo == 5 || codigo == 6)   
		        System.out.println("Vestuário");
		else if(codigo == 7)   
		        System.out.println("Higiene pessoal");
		else if(codigo >= 8 && codigo <=15)    
		        System.out.println("Limpeza e utensílios domésticos");
		else
		        System.out.println("Inválido");
		
	}
}
