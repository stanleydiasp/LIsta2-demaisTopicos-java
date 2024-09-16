/******************************************************************************

Escreva um programa que leia dois vetores – V1 e V2 – cada um com N (N<=10) valores
reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa deve gerar
um vetor – Resul como sendo o resultado das operações de V1 com V2, onde o código
da operação está no vetor Op nas respectivas posições.
V1

4 7 10 12 3

V2

8 13 10 18 30

Op

+ - / + *

Resul

12 -6 1 30 90

*******************************************************************************/
import java.util.Scanner;


public class Ex25
{
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        
        int tam, i, j, o, r;
        double[] v1 = null;
        double[] v2 = null;
        char [] op = null;
        double [] resul = null;
        
        do {
		    System.out.println("Digite o tamanho do vetor que deseja criar (de 2 a 10): ");
		    tam = sc.nextInt();
		    
		    if (tam <= 1 || tam > 10) {
		        System.out.println("Digite um valor inteiro e maior que 1: ");
		    } 
		    else {
		        v1 = new double[tam]; 
		        v2 = new double[tam];
		        op = new char[tam];
		        resul = new double[tam];
		        
		    }
		        
        }while(tam <= 1 || tam > 10);
		    
		System.out.println("Preencha o vetor: ");
		for(i = 0; i < tam; i++) {
		    v1[i] = sc.nextDouble();
		}
		
		System.out.println("Preencha o segundo vetor: ");
		for(i = 0; i < tam; i++) {
		    v2[i] = sc.nextDouble();
		}
		
		System.out.println("Preencha o vetor de sinais (+ - * /)");
		for(i = 0; i < tam; i++) {
		    do {
		        op[i] = sc.next().charAt(0);
		        
		        if(op[i] != '+' && op[i] != '-' && op[i] != '*' && op[i] != '/')
		            System.out.println("Sinal inválido. Digite novamente!");
		        
		    }while(op[i] != '+' && op[i] != '-' && op[i] != '*' && op[i] != '/');
		}
		
		for(i = 0; i < tam; i++) {
		    switch(op[i]) {
		        case '+':
		            resul[i] = v1[i] + v2[i];
		            break;
		        case '-':
		            resul[i] = v1[i] - v2[i];
		            break;
		        case '*':
		            resul[i] = v1[i] * v2[i];
		            break;
		        case '/':
		            if (v2[i] != 0) 
		                resul[i] = v1[i] / v2[i];
		            else if (v1[i] == 0 || v2[i] == 0) 
		                resul[i] = 0;
		            break;
		    }
		   
		}
		System.out.println("Resultado das operações:");
        for (i = 0; i < tam; i++) {
            System.out.println("V1[" + i + "] " + op[i] + " V2[" + i + "] = " + resul[i]);
        }
		    
	}
}
