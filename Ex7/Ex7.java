/******************************************************************************

Faça um algoritmo que receba o salário e um código correspondente ao cargo de um
funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o percentual de
aumento ao qual este funcionário tem direito segundo a tabela a seguir e o valor do
aumento baseado no salário. Ao final, mostre o salário com o aumento.

*******************************************************************************/
import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double salario, valorAumento, salarioAumento; 
	    int codigo;
	    
		System.out.println("Digite o salário:");
		salario = sc.nextDouble();
		
		System.out.println("Digite o código: ");
		codigo = sc.nextInt();
		
		if(codigo > 5) {
		    System.out.println("Código inválido!");
		    return;
		}
		
		switch(codigo) {
		    case 1:
		        valorAumento = salario * 0.50;
		        salarioAumento = salario + valorAumento;
		        System.out.println("Cargo: Escriturário");
		        System.out.println("Valor do percentual de aumento: 50%");
		        System.out.println("Valor do salário: " + salario);
		        System.out.println("Valor do aumento: " + valorAumento);
		        System.out.println("Valor do salário com aumento: " + salarioAumento);
		        break;
		    case 2: 
		        valorAumento = salario * 0.35;
		        salarioAumento = salario + valorAumento;
		        System.out.println("Cargo: Secretário");
		        System.out.println("Valor do percentual de aumento: 35%");
		        System.out.println("Valor do salário: " + salario);
		        System.out.println("Valor do aumento: " + valorAumento);
		        System.out.println("Valor do salário com aumento: " + salarioAumento);
		        break;
		    case 3: 
		        valorAumento = salario * 0.20;
		        salarioAumento = salario + valorAumento;
		        System.out.println("Cargo: Caixa");
		        System.out.println("Valor do percentual de aumento: 20%");
		        System.out.println("Valor do salário: " + salario);
		        System.out.println("Valor do aumento: " + valorAumento);
		        System.out.println("Valor do salário com aumento: " + salarioAumento);
		        break;
		    case 4: 
		        valorAumento = salario * 0.10;
		        salarioAumento = salario + valorAumento;
		        System.out.println("Cargo: Gerente");
		        System.out.println("Valor do percentual de aumento: 10%");
		        System.out.println("Valor do salário: " + salario);
		        System.out.println("Valor do aumento: " + valorAumento);
		        System.out.println("Valor do salário com aumento: " + salarioAumento);
		        break;
		    case 5:
		        System.out.println("Cargo: Diretor");
		        System.out.println("Valor do percentual de aumento: Sem desconto");
		        System.out.println("Valor do salário: " + salario);
		        System.out.println("Sem aumento");
		        System.out.println("Sem aumento");
		        break;
		}
		   
	}
}
