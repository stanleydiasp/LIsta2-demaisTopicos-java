/**************************
Crie 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente. Para tal,
utilize método: int sorteia (int limitInf, int limitSup) descrito abaixo que recebe por
parâmetro os limites inferior e superior dos valores gerados, tais limites deverão ser
informados pelo usuário (valide para que o limitInf seja menor que o limitSup), e retorne
um número neste intervalo. Em seguida crie vetores auxiliares que sejam preenchidos
pelos:
a. O vetor Soma deverá ser preenchido pela soma dos elementos de A e B.
Ex. A{1, 5} B{3, 4} Soma {4, 9}.
b. O vetor Intersecção deverá ser preenchido com os valores que estão em A
e B ao mesmo tempo. Ex. A{1, 5}, B{3, 5}, Interseccao{5}.
c. O vetor Diferença deverá ser preenchido com valores que estão em A mas
não estão em B. Ex. A{1, 5}, B{3, 5}, Diferenca{1}.
d. O vetor Intercalação deverá ser preenchido com a intercalação dos vetores
A e B. Ex. A {1, 5} e B {3, 4} Intercalacao {1, 3, 5, 4}.
***************************/
import java.util.Scanner;
import java.util.Random;


public class Ex27
{
    
    public static int sorteia (int limiteInferior, int limiteSuperior) { 
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        
        int [] A = new int[10];
        int [] B = new int[10];
        int [] soma = new int[10];
        int [] interseccao = new int[10];
        int [] diferenca = new int[10];
        int [] intercalacao = new int[20];
        int limiteInferior, limiteSuperior, i = 0, j = 0, b = 0, a = 0, k = 0;
        
        do {
		    System.out.println("Digite o limite inferior: ");
		    limiteInferior = sc.nextInt();
		    
		    System.out.println("Digite o limite superior: ");
		    limiteSuperior = sc.nextInt();
		    
		    if(limiteInferior >= limiteSuperior) 
		        System.out.println("O limite inferior não pode ser menor nem igual ao limite superior. Digite novamente!");
		        
        }while(limiteInferior >= limiteSuperior);
        
        for(i = 0; i < 10; i++) {
            A[i] = sorteia(limiteInferior, limiteSuperior);
            B[i]  = sorteia(limiteInferior, limiteSuperior);
        }
        
        
        System.out.println("Primeiro vetor: ");
        for(i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\n");
        System.out.println("Segundo vetor: ");
        for(i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
        
        System.out.println("\n");
        System.out.println("Soma dos elementos do vetor A com vetor B: ");
        for(i = 0; i < 10; i++) {
            soma[i] = A[i] + B[i];
            System.out.print(soma[i] + " ");
        }
        
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++) {
                if(A[i] == B[j]) {
                    interseccao[b] = A[i];
                    b++;
                    break;
                }
            }    
        }
        
        if(b > 0) {
            System.out.println("\n");
            System.out.println("Vetor Intersecção A e B: ");
            for(i = 0; i < b; i++) {
                System.out.print(interseccao[i] + " ");
            }
        } 
        else {
            System.out.println("Não há intersecção entre os vetores A e B.");
        }
        
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++) {
                if(A[i] != B[j]) {
                    diferenca[a] = A[i];
                    a++;
                    break;
                }
            }    
        }
        
        System.out.println("\n");
        System.out.println("Vetor com valores exclusivos de A: ");
        for(i = 0; i < b; i++) {
            System.out.print(diferenca[i] + " ");
        }
        
        for(i = 0; i < 10; i++) {
            intercalacao[k++] = A[i];
            intercalacao[k++] = B[i];
        }
        
        System.out.println("\n");
        System.out.println("Vetor com valores intercalados de A e B: ");
        for(i = 0; i < 20; i++) {
            System.out.print(intercalacao[i] + " ");
        }
        
	}
}