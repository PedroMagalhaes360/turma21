package lista2;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		/*
		 * 3-Faça um programa que receba a idade de uma pessoa
		 *  e mostre na saída em qual categoria ela se encontra:
		 *•	10-14 infantil
		 *•	15-17 juvenil
		 *•	18-25 adulto
		 */
		//Variaveis
		Scanner leia = new Scanner(System.in);
		int idade;
		
		//Entradas
		System.out.println("Escreva sua idade: ");
		idade = leia.nextInt();
		
		//Processos
		if (idade >=10 && idade <=14)
		{
			System.out.println("Voce pertence a categoria Infantil.");
		}
		else if (idade >=15 && idade <=17)
		{
			System.out.println("Voce pertence a categoria Juvenil.");
		}
		else if (idade >=18 && idade <=25)
		{
			System.out.println("Voce pertence a categoria Adulte.");
		}
		
	}
}
