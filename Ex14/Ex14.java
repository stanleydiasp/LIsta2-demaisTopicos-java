/******************************************************************************

14. Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
número indeterminado de alunos. Calcule e mostre:
a. A média aritmética das 2 notas lidas;
b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
(Exame); de 7 para cima (Aprovado);
c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.
f. O nome e a média dos Alunos com a maior e menor média da classe.

*******************************************************************************/
import java.util.Scanner; 


public class Ex14
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double nota1, nota2, media = 0, mediaDaClasse = 0, maiorMedia = 0, menorMedia = 10000, somaMedia = 0;;
	    int totalDeAlunos = 0, quantAlunosAprovados = 0, quantAlunosReprovados = 0, quantAlunosExame = 0;
	    String nome, nomeAlunoMenorMedia = "", nomeAlunoMaiorMedia = "", resp; 
	    
	     do{
	        
	        System.out.println("Digite o nome do aluno: ");
	        nome = sc.nextLine();
	        
	        totalDeAlunos++;
	        
	        do {
	            
	            System.out.println("Digite a primeira nota do aluno: ");
	            nota1 = sc.nextDouble();
	        
	            if(nota1 < 0 || nota1 > 10) 
	                System.out.println("A nota não pode ser menor que 0 e nem maior que 10! Digite novamente");
      
	        }while(nota1 < 0 || nota1 > 10);
	        
	        do {
	            
	            System.out.println("Digite a segunda nota do aluno: ");
	            nota2 = sc.nextDouble();
	        
	            if(nota2 < 0 || nota2 > 10) 
	                System.out.println("A nota não pode ser menor que 0 e nem maior que 10! " );

	        }while(nota2 < 0 || nota2 > 10);
	        
	        sc.nextLine();
	        
	        
	        media = (nota1 + nota2) / 2;
	        
	        
	        if (media < menorMedia) {
	            menorMedia = media;
	            nomeAlunoMenorMedia = nome;
	        }
	        
	        if (media > maiorMedia) {
	            maiorMedia = media;
	            nomeAlunoMaiorMedia = nome;
	        }
	        
	        if(media <= 3) {
	            System.out.println("Média: " + media);
	            System.out.println("Situação: Reprovado");
	            quantAlunosReprovados++;
	        }
	        else if(media > 3 && media < 7) {
	            System.out.println("Média: " + media);
	            System.out.println("Situação: Exame");
	            quantAlunosExame++;
	        }
	        else if(media >= 7 && media <= 10) {
	            System.out.println("Média: " + media);
	            System.out.println("Situação: Aprovado");
	            quantAlunosAprovados++;
	        }
	        
	        
	        somaMedia += media;
	        mediaDaClasse = somaMedia / totalDeAlunos;
	        
	        
	        System.out.println("Se deseja continuar digite (sim)");
	        resp = sc.nextLine().toLowerCase(); 
	        
	        
	    } while(resp.equals("sim") || resp.equals("s"));
	    
	    
	    System.out.println("Total de alunos da classe: " + totalDeAlunos);
	    System.out.println("Quantidade de alunos aprovados: " + quantAlunosAprovados);
	    System.out.println("Quantidade de alunos reprovados: " + quantAlunosReprovados);
	    System.out.println("Quantidade de alunos de exame: " + quantAlunosExame);
	    System.out.println("Media da classe: " + mediaDaClasse);
	    System.out.println("Nome do aluno com maior média: " +  nomeAlunoMaiorMedia);
	    System.out.println("Nome do aluno com menor média: " + nomeAlunoMenorMedia);
	    
	    
	    
	    
		
	}
}
