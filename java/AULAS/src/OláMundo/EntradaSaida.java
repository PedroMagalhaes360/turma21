package Ol·Mundo;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int soma;
		
		System.out.println("Valor A: ");
		a = ler.nextInt();
		System.out.println("Valor B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println(soma);
		
	}
	
		
}
