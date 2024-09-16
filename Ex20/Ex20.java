/******************************************************************************

Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir, encontre o
menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem
mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro do vetor é: V[x]. Já
o maior elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos informados
no vetor são todos diferentes entre si.

*******************************************************************************/
import java.util.Scanner;


public class Ex20
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int [] vet = new int[10];
		int maior = 0, menor = 1000000000, indiceMaior = 0, indiceMenor = 0, i; 
	
		for (i = 0; i <= 9; i ++) {
		    do {
		        
		        System.out.println("Preencha o vetor: ");
		        vet[i] = sc.nextInt();
		        
		        if(vet[i] < 0) 
		            System.out.println("O vetor deve ser preenchido com nº inteiros. Digite novamente!");
		        
		    }while(vet[i] < 0);
		    
		    if(maior < vet[i]) {
		        maior = vet[i];
		        indiceMaior = i;
		    }
		    
		    if(menor > vet[i]) {
		        menor = vet[i];
		        indiceMenor = i;
		    }
		
		}
		
		System.out.println("O menor elemento do vetor é " + menor + " e sua posição dentro do vetor é: " + "V[" + indiceMenor + "]");
		System.out.println("Já o maior elemento é "+ maior + " e está na posição " + "V[" + indiceMaior + "]");
		
	}
}
