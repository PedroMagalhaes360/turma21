package lista3;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * 5-Crie um programa que leia um n�mero do teclado at� que
		 * encontre um n�mero igual a zero. No final, mostre a soma
		 * dos n�meros digitados.(DO...WHILE)
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		
		int numero= 0;
		int soma= 0;
		
		//Processos
		do 
		{
			System.out.println("Digite um n�mero: ");
			numero= leia.nextInt();
			soma+=numero;
		}while (numero !=0);
		
		//Saidas
		System.out.printf("A soma dos valores �: %d" ,soma);
	}
}
