/******************************************************************************

Faça um programa que leia um código inteiro e um vetor de 10 posições de números reais.
Se o código for zero, termine o programa. Se for 1, mostre o vetor na ordem direta. Se for
2, mostre o vetor na ordem inversa.

*******************************************************************************/
import java.util.Scanner;


public class Ex24
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int [] vet = new int[4];
	    int i, codigo;
 
        System.out.println("Preencha o vetor: ");
        for (i = 0; i < 4; i++) {
		    do {      
		        vet[i] = sc.nextInt();
		        
		        if(vet[i] < 0) 
		            System.out.println("O vetor deve ser preenchido com um nº inteiro. Digite novamente!");
		    }while(vet[i] < 0);

        }   
        
        System.out.println("Digite: ");

        do {
            System.out.println("1 (ver vetor na forma direta): ");
            System.out.println("2 (ver vetor na forma inversa): ");
            System.out.println("0 (Encerrar o programa): ");
            codigo = sc.nextInt();
        
            if(codigo == 1) {
                System.out.println("Vetor na forma direta: ");
                for(i = 0; i < 4; i++) {
                    System.out.println(vet[i]);
                }
            } 
            else if(codigo == 2) {
                System.out.println("Vetor na forma inversa: ");
                for(i = 3; i >= 0; i--) {
                    System.out.println(vet[i]);
                }
            }
            else if (codigo == 0) {
                System.out.println("Programa encerrado!");
                break;
            }
            else {
                System.out.println("Código inválido. Digite um código válido!");
            }
            
        }while(codigo != 1 || codigo != 2 || codigo != 0);
        
	}
}
