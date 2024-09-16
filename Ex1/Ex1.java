/******************************************************************************

1. Crie um programa para determinar se um número inteiro A é divisível por outro número
B. Os valores devem ser fornecidos pelo usuário.

*******************************************************************************/
import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int A = sc.nextInt();
		
		System.out.println("Digite um número: ");
		int B = sc.nextInt();
		
		if(A % B == 0)
            System.out.println(A + " é divisível por " + B );
        else
		    System.out.println(A + " não é divisível por " + B );

		
		
		
		
		
		
		

	}
}
