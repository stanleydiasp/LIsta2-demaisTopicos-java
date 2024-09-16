/******************************************************************************
 * 
Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
do saldo deve ser atualizado.
Exemplo:

*******************************************************************************/
import java.util.Scanner;


public class Ex15
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    char resp;
	    double valorDeposito = 0, valorSaque = 0, saldoAtualizado = 0;
	    boolean saqueValido = false;
	    
	    do {
	        
		    System.out.println("Opções: ");
		    System.out.println("(a) Consulta saldo ");
		    System.out.println("(b) Saque ");
		    System.out.println("(c) Depósito ");
		    System.out.println("(d) Sair ");
		    resp = sc.next().charAt(0);
		    
		    if(resp == 'a') {
		        System.out.println("Saldo atual - R$: " + saldoAtualizado);
		    }
		    
		    if (resp == 'c') {  
                System.out.println("Valor do depósito: ");
                valorDeposito = sc.nextDouble();  
                
                if (valorDeposito > 0) {
                    saldoAtualizado += valorDeposito;
                    System.out.println("Depósito realizado! Saldo atualizado: R$ " + saldoAtualizado);
                } 
                else {
                    System.out.println("Valor de depósito inválido! Tente novamente.");
                }
            }

            if (resp == 'b') {  
                
                do {
                    System.out.println("Digite o valor que deseja sacar - R$: ");
                    valorSaque = sc.nextDouble();  

                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido! Digite um valor positivo.");
                    } 
                    else if (valorSaque > saldoAtualizado) {
                        System.out.println("Saldo insuficiente! Digite um valor válido.");
                    } 
                    else {
                        saldoAtualizado -= valorSaque;
                        saqueValido = true;  
                    }

                } while (!saqueValido);  
		        
		  }
		
	    }while(resp != 'd');
	    
	    System.out.println("Programa encerrado");
	    
	}
}