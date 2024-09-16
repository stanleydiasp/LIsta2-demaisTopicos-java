/******************************************************************************

26. Faça um programa que leia um vetor de inteiros de 10 posições e garanta que todos os
elementos presentes no vetor sejam todos distintos entre si.

*******************************************************************************/
import java.util.Scanner;


public class Ex26
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int [] vet = new int[10];
	    int i, j;
	    boolean distinto;

		System.out.println("Preencha o vetor: ");
		for(i = 0; i < 10; i++) {
		    do {
		        do {
		            vet[i] = sc.nextInt();
                    distinto = true;
                    
                    if(vet[i] < 0)
                        System.out.println("O número deve ser inteiro. Digite novamente!");
		        }while(vet[i] < 0);
		        
		        for(j = 0; j < i; j++) {
		            if(vet[i] == vet[j]) {
		                System.out.println("Os elementos do vetor não podem ser iguais. Digite novamente");
		                distinto = false;
		            }
		           
		        } 
		    }while(!distinto);
		}
		
		System.out.println("Vetor preenchido: ");
		for(i = 0; i < 10; i++) {
		    System.out.println("vet[" + i + "] = " + vet[i]);
		}
	}
}
