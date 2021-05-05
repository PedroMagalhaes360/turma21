package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio7 {
	public static void main (String args[]) {
		Scanner read = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		//Variaveis
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		
		//Entradas
		System.out.println("Valores da equação linear:");
		System.out.print("Digite o valor de A: ");
		a = read.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = read.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = read.nextDouble();
		System.out.print("Digite o valor de D: ");
		d = read.nextDouble();
		System.out.print("Digite o valor de E: ");
		e = read.nextDouble();
		System.out.print("Digite o valor de f: ");
		f = read.nextDouble();
		System.out.println();
		
		//Processos
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		//Saidas
		System.out.println("O valor de x é "+formatador.format(x)+"; e o valor de y é "+formatador.format(y));	
	}
}

