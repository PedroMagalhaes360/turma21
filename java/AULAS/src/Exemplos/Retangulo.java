package Exemplos;

import java.util.Scanner;
public class Retangulo {
	public static void main (String[]args) {
	Scanner leia = new Scanner (System.in);
	
	double altura1,altura2;
	double base1,base2;
	double area1, area2;
	
	
	System.out.println("Por favor insira a altura do retangulo 1: ");
	altura1 = leia.nextDouble();
	System.out.println("Por favor insira a base do retangulo 1: ");
	base1 = leia.nextDouble();
	System.out.println("Por favor insira a altura do retangulo 2: ");
	altura2 = leia.nextDouble();
	System.out.println("Por favor insira a base do retangulo 2: ");
	base2 = leia.nextDouble();
	
	area1 = altura1*base1;
	area2 = altura2*base2;
	
		if(area1 > area2)
		{
			System.out.printf("O retangulo 1 tem a maior área. Área total de: %.2f", area1);
		}
		else
		{
			System.out.printf("O retangulo 2 tem a maior área. Área total de: %.2f", area2);
		
		}
	}
}
