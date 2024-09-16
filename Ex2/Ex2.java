/******************************************************************************

Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo
(entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65).

*******************************************************************************/
import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in); 
	    
		System.out.println("Eleitor, informe sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 16)
		    System.out.println("Idade inválida! A idade mínima para votar é 16 anos.");
		else if(idade == 16 || idade == 17)
		    System.out.println("Facultativo");
		else if(idade >= 18 && idade <= 65)
		    System.out.println("Obrigatório");
	    else
		    System.out.println("Dispensado");

	}
}
