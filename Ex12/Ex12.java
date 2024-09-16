/******************************************************************************

Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de validar
se a nota informada é válida (0.0 ≤ nota ≤ 10), caso contrário o sistema deve informar ao
usuário o erro e pedir para ler novamente. Usar um laço Faça-Enquanto na leitura das
notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:

*******************************************************************************/
import java.util.Scanner;


public class Ex12
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String nome, resposta;
	    
	    do {
	            System.out.println("Digite o nome do aluno: ");
	            nome = sc.nextLine();
	            
	            double nota1, nota2, media;
	            
	            do {
	                 System.out.println("Digite a primeira nota do aluno: ");
	                 nota1 = sc.nextDouble();
	            
	                 if(nota1 > 10 || nota1 < 0) 
	                    System.out.println("Erro! Digite novamente a primeira nota");
	            } while (nota1 > 10 || nota1 < 0);
	            
	                
	            do {
	                 System.out.println("Digite a segunda nota do aluno: ");
	                 nota2 = sc.nextDouble();
	            
	                 if(nota2 > 10 || nota2 < 0) 
	                    System.out.println("Erro! Digite novamente a primeira nota");
	            } while (nota2 > 10 || nota2 < 0);
	            
	            
	            media = (nota1 + nota2) / 2;
	            
	            
	            System.out.println("O aluno " + nome + " tem uma média de: " + media);
	            
	            sc.nextLine();
	            
	            System.out.println("Deseja continuar? Digite 'sim' ");
	            resposta = sc.nextLine().toLowerCase();

	    } while(resposta.equals("sim"));
	}
}
