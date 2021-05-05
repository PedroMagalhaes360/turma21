package Lista1;

import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 /*
	  * 
	  */
	 //Variaves
	 int a;
	 int b;
	 int c;
	 
	 //Entradas
	 System.out.println("Crie o valor de A: ");
	 a= leia.nextInt();
	 System.out.println("Crie o valor de B: ");
	 b= leia.nextInt();
	 System.out.println("Crie o valor de C: ");
	 c= leia.nextInt();
	 
	 //Processos
	 double s;
	 double r;
	 double d;
	 
	 r= Math.pow((a+b),2);
	 s= Math.pow((b+c),2);
	 d= (s+r)/2;
	 
	 //Saidas
	 System.out.println("Para os inteiros positivos " + a + ", " + b + " e " + c + " o valor de d é: " + d );
		System.out.println("O valor de r é: " + r + " e de s é: " + s );
		System.out.println("O valor de d é: " + d);
}
}
