/******************************************************************************

Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado.

*******************************************************************************/
import java.util.Scanner;


public class Ex17
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int codigo, quantidadeProduto;
	    double preco = 0, totalPedido = 0;
	    String resp;
	    
	    do{
	        
	        do {
	            
		        System.out.println("Digite o código do produto: ");
		        codigo = sc.nextInt();

		        if(codigo < 1 || codigo > 5) {
		            System.out.println("Só existem 5 códigos! Digite novamente.");
		        }
		        
	        }while(codigo < 1 || codigo > 5);
		    
		    System.out.println("Digite a quantidade de produto que deseja: ");
		    quantidadeProduto = sc.nextInt();
		    
		    if(codigo == 1) {
		        preco = 1.50;
		    }
		    else if(codigo == 2) {
		        preco = 2.00;
		    }
		    else if(codigo == 3) { 
		        preco = 2.50;
		    }
		    else if(codigo == 4) {
		        preco = 3.00;
		    }    
		    else if(codigo == 5) {
		        preco = 1.50;
		    }
		    
		    
		    totalPedido += preco * quantidadeProduto;
		    
		    System.out.println("Se deseja continuar comprando digite 's':");
		    resp = sc.next();
		    
	    }while(resp.equals("s"));
	    
	    System.out.println("Preço do pedido - R$: " + totalPedido);
	}
}
