/******************************************************************************
 * 
Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário.
• Dados de Entrada: Matrícula do funcionário (int); Quantidade de horas-extras
trabalhadas.
• Constantes: Salário Mínimo = R$ 788.00; Valor da Hora-Extra = R$ 10.00.
Sabe-se:
• Salário hora-extra = horas-extras * Valor da Hora-Extra;
• Salário bruto = 3 * Salário Mínimo + Salário hora-extra;
• Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$
1500,00;
• Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for
maior que R$ 2000,00; • Salário líquido = salário bruto – deduções.

*******************************************************************************/
import java.util.Scanner;


public class Ex4
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    final double salarioMinimo = 788;
		final int horaExtra = 10;
		
		int numDeMatricula, numHoraExtraTrabalhadas, quantidadeDeSalario;
	    
	    double salarioBruto, salarioLiquido, salarioHoraExtra, descontoInss, impostoDeRenda;
	    
		System.out.println("Digite o número de matrícula do funcionário: ");
		numDeMatricula = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas-extras trabalhadas pelo funcionário: ");
		numHoraExtraTrabalhadas = sc.nextInt();
		
		System.out.println("Digite a quantidade salario: ");
		quantidadeDeSalario = sc.nextInt();
		
		
		salarioHoraExtra = numHoraExtraTrabalhadas * horaExtra;
		
		salarioBruto = quantidadeDeSalario * salarioMinimo + salarioHoraExtra;
		
		if (salarioBruto <= 1500) {
		    System.out.println("Salario R$ " + salarioBruto);
		    
		}
		else if (salarioBruto > 1500 && salarioBruto <= 2000) {
		    descontoInss = salarioBruto * 0.12;
		    salarioLiquido = salarioBruto - descontoInss;
		    System.out.println("Salario Bruto: R$ " + salarioBruto);
		    System.out.println("Salario Liquido: R$ " + salarioLiquido);
		}
		else {
		    descontoInss = salarioBruto * 0.12;
		    impostoDeRenda = salarioBruto * 0.20;
		    System.out.println(impostoDeRenda);
            salarioLiquido = salarioBruto - descontoInss - impostoDeRenda;
            System.out.println("Salario Bruto: R$ " + salarioBruto);
		    System.out.println("Salario Liquido: R$ " + salarioLiquido);
		}
		
		
		
		
		
		
		
		
	}
}
