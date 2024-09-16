/******************************************************************************* 
Escreva um programa que receba quinze números inteiros e armazene em um vetor a raiz
quadrada de cada número. Caso o valor digitado seja menor do que zero, o número -1
deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
armazenados.

*******************************************************************************/
import java.util.Scanner; 

public class Ex21
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int [] vet = new int[15];  //Alterar o vetor para testar com um número menor
	    double [] vetRaiz = new double[15];  //Alterar o vetor para testar com um número menor
	    int i;
	    
	    for(i = 0; i < 15; i++) { //Alterar o vetor para testar com um número menor
		    
		    System.out.println("Preencha o vetor: ");
		    vet[i] = sc.nextInt();
		    
		    if(vet[i] < 0) {
		        vetRaiz[i] = -1;
		    }
		    else {
		        vetRaiz[i] = Math.sqrt(vet[i]);
		    }
		        
		    
	    }
	    
	    for (i = 0; i < 15; i++) { //Alterar o vetor para testar com um número menor
            System.out.println("Raiz quadrada da posição[" + i + "] = " + vetRaiz[i]);
        }
	}
}
