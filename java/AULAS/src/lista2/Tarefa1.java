package lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		/*
		 * 1-Fa�a um programa que receba tr�s inteiros e diga
		 * qual deles � o maior.
		 */
		//Variantes
		Scanner leia = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		//Entradas
		System.out.println("Fale o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Fale o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Fale o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		//Processos
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior n�mero �: "+num1+".");
		}
		else if (num2 > num1 && num2 > num3) 
		{
			System.out.println("O maior n�mero �: "+num2+".");
		}
		else if (num3 > num1 && num3 > num1)
			System.out.println("O maior n�mero �: "+num3+".");
	}
}
