package lista3;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		/*
		 * 2-Ler 10 números e imprimir quantos são pares
		 * e quantos são ímpares. (FOR)
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		
		int numeros;
		int par= 0;
		int impar= 0;
		
		//Processos
		for (int x= 1; x<= 10; x++) 
		{
			System.out.println("Digite um numero: ");
			numeros= leia.nextInt();
			if ((numeros %2)==0) 
			{
				par++;
			}
			else 
			{
				impar++;
			}
		}
		//Saidas
		System.out.printf("A quantidades de numeros pares é %d, e de numeros impares é %d" ,par ,impar);
		
	}
}
