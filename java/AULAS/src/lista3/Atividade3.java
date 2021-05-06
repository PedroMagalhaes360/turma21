package lista3;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		/*
		 * 3-Solicitar a idade de várias pessoas e imprimir:
		 * Total de pessoas com menos de 21 anos. Total de pessoas
		 * com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		
		final int pare= -99;
		int idade= 0;
		int idadeMenos21= 0;
		int idadeMais50= 0;
		
		//Processos
		while (idade != pare) 
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade < 21) 
			{
				idadeMenos21++;
			}
			if (idade > 50) 
			{
				idadeMais50++;
			}
		}	
		//Saidas
		System.out.printf("Pessoas com menos de 21 anos é %d, e pessoas com mais de 50 anos é %d." ,(idadeMenos21-1), idadeMais50 );
		
	}
}
