package lista4;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		/*
		 * 3-Leia uma matriz 3 x 3, conte e escreva 
		 * quantos valores maiores que 10 ela possui.
		 */
		//Variantes
		Scanner leia = new Scanner(System.in);
		int A[][] = new int[3][3];
		int contador=0;
		final int parametro = 10;
		
		//Processos
		for(int x = 0; x < A.length; x++) 
		{
			for(int y= 0; y< A[0].length; y++ ) 
			{
				System.out.printf("Digite o número da linha %d coluna %d da matriz: ", (x+1), (y+1));
				A[x][y]= leia.nextInt();
				if(A[x][y]>parametro) 
				{
					contador++;
				}
			}
		}
		//Saida
		System.out.printf("O número de elementos com valor maior que 10, na matriz, é %d \n", contador);
		System.out.printf("\nOs números da matriz são:");
		for(int x = 0; x < A.length; x++) 
		{
			for(int y= 0; y< A[0].length; y++) 
			{
				System.out.printf("%d\t", A[x][y]);
			}
			System.out.println();
		}

	}

}