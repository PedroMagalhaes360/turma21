package lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		/*
		 * 1-Faça um programa que receba três inteiros e diga
		 * qual deles é o maior.
		 */
		//Variantes
		Scanner leia = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		//Entradas
		System.out.println("Fale o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Fale o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Fale o terceiro número: ");
		num3 = leia.nextInt();
		
		//Processos
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior número é: "+num1+".");
		}
		else if (num2 > num1 && num2 > num3) 
		{
			System.out.println("O maior número é: "+num2+".");
		}
		else if (num3 > num1 && num3 > num1)
			System.out.println("O maior número é: "+num3+".");
	}
}
