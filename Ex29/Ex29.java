/******************************************************************************

Utilize o método sorteia que retorna um número aleatório de limiteInferior até
limiteSuperior para gerar um número aleatório neste intervalo. O número gerado pelo
sorteia deverá ser colocado em um vetor de 1000 posições. Leia limiteInferior e
limiteSuperior e preencha o vetor de 1000 posições, garantindo que todos os valores
presentes no vetor são distintos entre si.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Ex29
{
    public static int sorteia (int limiteInferior, int limiteSuperior) { 
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int limiteInferior = 0, limiteSuperior = 0, i = 0, j = 0, numeroAleatorio;
	    int [] vet = new int[1000]; //Altere para 20, pra ficar mais fácil de visualizar
	    boolean distinto;
	    
	    do {
            System.out.println("Digite o limite inferior: ");
            limiteInferior = sc.nextInt();

            System.out.println("Digite o limite superior: ");
            limiteSuperior = sc.nextInt();

            if(limiteInferior < 0 || limiteSuperior < 0) 
                System.out.println("Os limites devem ser positivos.");
            else if (limiteInferior >= limiteSuperior) 
                System.out.println("O limite inferior não pode ser maior ou igual ao limite superior.");
            else if (limiteSuperior - limiteInferior < 999) //Altere para 19, pra ficar mais fácil de visualizar
                System.out.println("Intervalo pequeno demais. O intervalo deve ter pelo menos 1000 números de diferença.");
            else 
                break;
                
        }while(limiteInferior < 0 || limiteSuperior < 0 || limiteInferior >= limiteSuperior || limiteSuperior - limiteInferior < 999);
        
        while(j < 1000) { //Altere para 20, pra ficar mais fácil de visualizar
            numeroAleatorio = sorteia(limiteInferior, limiteSuperior);
            
            distinto = false;
            for(i = 0; i < j; i++) {
                if(vet[i] == numeroAleatorio)  {
                    distinto = true;
                    break;
                }
            }
            
            if(!distinto) {
                vet[j] = numeroAleatorio;
                j++;
            }
        }
        
        System.out.println("Números gerados: ");
        for (i = 0; i < 1000; i++) { //Altere para 20, pra ficar mais fácil de visualizar
            System.out.print(vet[i] + " ");
        }
        
		
		
	}
}
