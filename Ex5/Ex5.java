/******************************************************************************

Escrever um programa que leia o número de identificação, as 3 notas obtidas por um
aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Valide
para que todas as entradas sejam 0 ≤ nota ≤ 10. Calcule a média de aproveitamento do
aluno, usando a fórmula:

Média = (nota1 + nota2 ∗ 2 + nota3 ∗ 3 + media dos exercicios) / 7

*******************************************************************************/
import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int numId; 
	    double nota1, nota2, nota3, mediaExercicios, media; 
	    
		System.out.println("Digite o número de identificação do aluno: ");
		numId = sc.nextInt();
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = sc.nextDouble();
		if(nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
            return;
		}
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = sc.nextDouble();
		if(nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
            return;
		}
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = sc.nextDouble();
		if(nota3 < 0 || nota3 > 10) {
            System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
            return;
		}
		
		System.out.println("Digite a média dos exercícios do aluno: ");
		mediaExercicios = sc.nextDouble();
		if(mediaExercicios < 0 || mediaExercicios > 10) {
            System.out.println("Média dos exercícios inválida! A nota deve ser entre 0 e 10.");
            return;
		}
        
        
		media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
		
		if (media <= 10 && media >= 9) {
		    System.out.println("Número do aluno: " + numId);
		    System.out.println("Primeira nota: " + nota1);
		    System.out.println("Segunda nota: " + nota2);
		    System.out.println("Terceira nota: " + nota3);
		    System.out.println("Média dos exercícios: " + mediaExercicios);
		    System.out.println("Média de aproveitamento: " + media);
		    System.out.println("O conceito do aluno é A e ele está aprovado");
		}
		else if (media < 9 && media >= 7.5) {
		    System.out.println("Número do aluno: " + numId);
		    System.out.println("Primeira nota: " + nota1);
		    System.out.println("Segunda nota: " + nota2);
		    System.out.println("Terceira nota: " + nota3);
		    System.out.println("Média dos exercícios: " + mediaExercicios);
		    System.out.println("Média de aproveitamento: " + media);
		    System.out.println("O conceito do aluno é B e ele está aprovado");
		}
		else if (media < 7.5 && media >= 6) {
		    System.out.println("Número do aluno: " + numId);
		    System.out.println("Primeira nota: " + nota1);
		    System.out.println("Segunda nota: " + nota2);
		    System.out.println("Terceira nota: " + nota3);
		    System.out.println("Média dos exercícios: " + mediaExercicios);
		    System.out.println("Média de aproveitamento: " + media);
		    System.out.println("O conceito do aluno é C e ele está aprovado");
		}
		else if (media < 6 && media >= 4) {
		    System.out.println("Número do aluno: " + numId);
		    System.out.println("Primeira nota: " + nota1);
		    System.out.println("Segunda nota: " + nota2);
		    System.out.println("Terceira nota: " + nota3);
		    System.out.println("Média dos exercícios: " + mediaExercicios);
		    System.out.println("Média de aproveitamento: " + media);
		    System.out.println("O conceito do aluno é D e ele está reprovado");
		}
		else {
		    System.out.println("Número do aluno: " + numId);
		    System.out.println("Primeira nota: " + nota1);
		    System.out.println("Segunda nota: " + nota2);
		    System.out.println("Terceira nota: " + nota3);
		    System.out.println("Média dos exercícios: " + mediaExercicios);
		    System.out.println("Média de aproveitamento: " + media);
		    System.out.println("O conceito do aluno é E e ele está reprovado");
		}   

        
	}
}
