package lista4;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		 *� Os n�meros pares digitados;  
		 *� A soma dos n�meros pares digitados; 
		 *� Os n�meros �mpares digitados; 
		 *� A quantidade de n�meros �mpares digitados.
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		int numeros [] =  new int [6];
		int somaPares= 0;
		int somaImpares= 0;
		
		//Processos
		for (int x= 0; x< numeros.length; x++) 
		{
			System.out.printf("Digite o %d n�mero: ",x+1);
			numeros [x]= leia.nextInt();	
		}
		System.out.println("Esses s�o os n�meros pares: ");
		
		for (int x= 0; x< numeros.length; x++) 
		{
			if ((numeros [x] %2)==0 && numeros [x] !=0) 
			{
				System.out.println(numeros [x]+ " , ");
				somaPares= numeros [x];
			}
		}
		System.out.println("Esses numeros s�o impares: ");
		
		for (int y= 0; y< numeros.length; y++) 
		{
			if (((numeros [y %2])==1 || (numeros [y] %2)==-1) && numeros [y] != 0);
			{
				System.out.println(numeros [y] +" , ");	
				somaImpares= numeros [y];
			}
			
		}
		System.out.printf("\n A soma dos n�meros pares � %d, e dos comuns � %d" ,somaPares ,somaImpares);
	}
	
	
}
