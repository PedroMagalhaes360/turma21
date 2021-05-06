package lista3;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * 5-Crie um programa que leia um número do teclado até que
		 * encontre um número igual a zero. No final, mostre a soma
		 * dos números digitados.(DO...WHILE)
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		
		int numero= 0;
		int soma= 0;
		
		//Processos
		do 
		{
			System.out.println("Digite um número: ");
			numero= leia.nextInt();
			soma+=numero;
		}while (numero !=0);
		
		//Saidas
		System.out.printf("A soma dos valores é: %d" ,soma);
	}
}
