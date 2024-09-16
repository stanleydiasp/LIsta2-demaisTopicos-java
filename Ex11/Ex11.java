/******************************************************************************

Escrever um programa que calcule todos os números inteiros divisíveis por um certo valor
indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo: Valor do divisor: 3;
Inicio do Intervalo: 17;
Fim do Intervalo: 29;
Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27.

*******************************************************************************/
import java.util.Scanner;

public class Ex11
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int divisor, minIntervalo, maxIntervalo, nDivisiveis, i; 
	    
		System.out.println("Digite o divisor: ");
		divisor = sc.nextInt();
		
		if (divisor <= 0) {
		    System.out.println("O divisor deve ser maior que 0!");
		    return;
		}
		
		System.out.println("Digite um número para o intervalo mínimo: ");
		minIntervalo = sc.nextInt(); 
		
		if(minIntervalo < 0) {
		    System.out.println("O intervalo mínimo deve ser um número inteiro!");
		    return;
		}
		
		System.out.println("Digite um número para o intervalo máximo: ");
		maxIntervalo = sc.nextInt();
		
		if(maxIntervalo < 0) {
		    System.out.println("O intervalo máximo deve ser um número inteiro!");
		    return;
		}
		else if(maxIntervalo <= minIntervalo) {
		    System.out.println("O intervalo máximo não pode ser menor ou igual o intervalo mínimo!");
		    return;
		}
		
		for(i = minIntervalo; i <= maxIntervalo; i++) {
		    
		        if(i % divisor == 0) 
		            System.out.println(i);
		            
		    }
		
	}
}
