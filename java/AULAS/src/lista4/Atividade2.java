package lista4;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
		 *• Os números pares digitados;  
		 *• A soma dos números pares digitados; 
		 *• Os números ímpares digitados; 
		 *• A quantidade de números ímpares digitados.
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		int numeros [] =  new int [6];
		int somaPares= 0;
		int somaImpares= 0;
		
		//Processos
		for (int x= 0; x< numeros.length; x++) 
		{
			System.out.printf("Digite o %d número: ",x+1);
			numeros [x]= leia.nextInt();	
		}
		System.out.println("Esses são os números pares: ");
		
		for (int x= 0; x< numeros.length; x++) 
		{
			if ((numeros [x] %2)==0 && numeros [x] !=0) 
			{
				System.out.println(numeros [x]+ " , ");
				somaPares= numeros [x];
			}
		}
		System.out.println("Esses numeros são impares: ");
		
		for (int y= 0; y< numeros.length; y++) 
		{
			if (((numeros [y %2])==1 || (numeros [y] %2)==-1) && numeros [y] != 0);
			{
				System.out.println(numeros [y] +" , ");	
				somaImpares= numeros [y];
			}
			
		}
		System.out.printf("\n A soma dos números pares é %d, e dos comuns é %d" ,somaPares ,somaImpares);
	}
	
	
}
