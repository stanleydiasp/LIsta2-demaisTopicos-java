/******************************************************************************

Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre a
quantidade de números superiores a 25 e suas respectivas posições. O programa deverá
mostrar uma mensagem se não existir nenhum número nessa condição.

*******************************************************************************/
import java.util.Scanner;


public class Ex22
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
        int [] vet = new int[10];
        int i, quantidadeMaior25 = 0, indiceMaiores25;
        
		for(i = 0; i < 10; i++) {
		    
		    do {
		        
		        System.out.println("Preencha o vetor: ");
		        vet[i] = sc.nextInt();
		        
		        if(vet[i] < 0)
		           System.out.println("Digite um número inteiro!");
		    }while(vet[i] < 0);
		    
		}
		
		for(i = 0; i < 10; i++) {
		    
		    if(vet[i] > 25) {
		        
		        System.out.println("Número: " + vet[i] + " na posição V[" + i + "]");
		        
                quantidadeMaior25++;
		        
		    } 
		    
		}
		
		System.out.println("A quantidade de nº maiores que 25 é: " + quantidadeMaior25);
		
		if(quantidadeMaior25 == 0) {
		    System.out.println("Não existem nº maiores que 25 nesse vetor!");
		}
		
	}
}
