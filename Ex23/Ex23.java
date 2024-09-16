/***************************
Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo
vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com
seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
Ex.:
Num [ 5 12 4 7 10 3 2 6 23 16 ]
Divis [ 3 11 5 8 2]
Saída:
Número 5:
Divisível por 5 na posição 2
Número 12:
Divisível por 3 na posição 0
Divisível por 2 na posição 4
Número 4:
Divisível por 2 na posição 4
***************************/
import java.util.Scanner;


public class Ex23
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int [] vet = new int[10];
	    int [] vet2 = new int[5];
	    int i, j, contadorDivisor;
	    
	    
	    System.out.println("Preencha o primeiro vetor com um número inteiro positivo: ");
	    for(i = 0; i < 10; i++) {
	       
            do {
                vet[i] = sc.nextInt();
                
                if(vet[i] < 0)
                    System.out.println("Número inválido. Digite um número inteiro positivo.");
                    
            } while(vet[i] < 0);
        }
	    
	    
	    System.out.println("Preencha o segundo vetor com um número inteiro positivo: ");
	    for(i = 0; i < 5; i++) {
	        
            do {
                vet2[i] = sc.nextInt();
                
                if(vet2[i] < 0)
                    System.out.println("Número inválido. Digite um número inteiro positivo.");
                    
            } while(vet2[i] < 0);
        }
	    
	    for(i = 0; i < 10; i++) {
	        contadorDivisor = 0;
	        System.out.println("Número " + vet[i] + ":");
	        
	        for(j = 0; j < 5; j++) {
	            if(vet[i] % vet2[j] == 0) {
	                System.out.println("Divisível por " + vet2[j] + " na posição " + j);
	                contadorDivisor++;
	            }
	        }
	        
	        if(contadorDivisor == 0) {
	            System.out.println("Não é divisível por nenhum número do segundo vetor");
	        }
	    }
		    
	}
}