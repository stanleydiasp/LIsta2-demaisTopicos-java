/******************************************************************************
 * 
18. Desenhe a seguinte pirâmide de asteriscos. O usuário deve determinar a quantidade de
linhas.

*******************************************************************************/
import java.util.Scanner; 


public class Ex18
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        
        int linhas, i;
        String asterisco = "*";
        
        do {
            
		    System.out.println("Digite a quantidade de linhas: ");
		    linhas = sc.nextInt();
		    
		    if(linhas < 0) 
		        System.out.println("O nº de linhas deve ser positivo, digite novamente!");
		        
        }while(linhas < 0);
		
		
		for(i = 1; i <= linhas; i++) {
		    System.out.println(asterisco);
		    asterisco += "*";
		}
	}
}
