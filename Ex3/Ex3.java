/******************************************************************************

Escreva um programa que leia o valor da compra e imprima o valor da venda de acordo com a
tabela a seguir. Cuidado com valor inválido de compra:

Valor da Compra Valor da Venda
Valor < R$ 10,00 || Lucro de 70%
R$ 10,00 <= Valor < R$ 30,00 || Lucro de 50%
R$ 30,00 <= Valor < R$ 50,00 || Lucro de 40%
Valor >= R$ 50,00 || Lucro de 30%

*******************************************************************************/
import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o valor da compra");
		double valorDaCompra = sc.nextDouble();
		
		double valorDaVenda;
		
		
		if(valorDaCompra < 0){
		    System.out.println("Valor de compra inválido!");
		}
		else if(valorDaCompra < 10){
		    valorDaVenda = valorDaCompra + (valorDaCompra * 0.7);
		    System.out.println("Valor da venda: R$ " + valorDaVenda);
		}
		else if(valorDaCompra >= 10 && valorDaCompra < 30) {
		    valorDaVenda = valorDaCompra + (valorDaCompra * 0.5);
		    System.out.println("Valor da venda: R$ " + valorDaVenda);
		}
		else if(valorDaCompra >= 30 && valorDaCompra < 50) {
		    valorDaVenda = valorDaCompra + (valorDaCompra * 0.4);
		    System.out.println("Valor da venda: R$ " + valorDaVenda);
		}
		else {
		    valorDaVenda = valorDaCompra + (valorDaCompra * 0.3);
		    System.out.println("Valor da venda: R$ " + valorDaVenda);
		}
		
	}
}
