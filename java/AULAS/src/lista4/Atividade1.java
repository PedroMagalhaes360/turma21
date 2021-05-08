package lista4;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		/*
		 * 1- Faça um programa que possua um vetor denominado A que
		 * armazene 6 números inteiros. O programa deve executar os
		 * seguintes passos: 
         *(a) Atribua os seguintes valores a esse vetor:
         * 1, 0, 5, -2, -5, 7. 
         *(b) Armazene em uma variável inteira (simples) a soma entre
         * os valores das posições A[0], A[1] e A[5] do vetor e mostre
         * na tela esta soma. 
         *(c) Modifique o vetor na posição 4, atribuindo a esta posição
         * o valor 100. 
         *(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		//Variantes
		Scanner leia = new Scanner(System.in);
		
		int A[] = new int [6];
		int resultado= 0;
		
		//Processos
		for (int x= 0; x< A.length; x++) 
		{
			System.out.println("Digite um número: ");
			A[x]= leia.nextInt();
			
			if (x==0 || x==1 || x==5) 
			{
				resultado+=A[x];
			}
			if (x==4) 
			{
				A[x] = 100;
			}
			
		}
		//Saidas
		System.out.printf("A soma dos elementos da posição A[0] = %d, A[1] = %d e A[5] = %d é %d \n", A[0], A[1], A[5], resultado);
		System.out.println("\nOs elementos do vetor são: ");
		for(int x= 0; x<A.length; x++) 
		{
			System.out.println(A[x]);
		}
	}
}
