/******************************************************************************

13. Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao usuário
a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”.

*******************************************************************************/
import java.util.Scanner;


public class Ex13
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int senha, senhaInformada;
	    
	    do {
	        
		    System.out.println("Crie sua senha: ");
		    senha = sc.nextInt();
		
		    if(senha < 0) {
		        System.out.println("A senha deve ser um número inteiro! Tente novamente");
		    }
		    
	    }while(senha < 0);
		
		do {
		    
		    System.out.println("Digite a senha informada: ");
		    senhaInformada = sc.nextInt();
		    
		    if(senhaInformada != senha)
		        System.out.println("Senha incorreta, tente novamente");
		    
		}while(senhaInformada != senha);
		
		if (senhaInformada == senha)
		    System.out.println("Senha correta! Bem-vindo ao sistema");
		
	}
}
