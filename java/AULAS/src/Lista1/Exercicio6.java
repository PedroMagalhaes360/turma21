package Lista1;
import java.util.Scanner;
public class Exercicio6 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Variantes
		double xponto1;
		double xponto2;
		double yponto1;
		double yponto2;
		double distancia;
		
		//Entradas
		System.out.println("escreva o valor de x ponto1 em metros: ");
		xponto1=leia.nextDouble();
		System.out.println("escreva o valor de x ponto2 em metros: ");
		xponto2=leia.nextDouble();
		System.out.println("escreva o valor de y ponto1 em metros: ");
		yponto1=leia.nextDouble();
		System.out.println("escreva o valor de y ponto2 em metros: ");
		yponto2=leia.nextDouble();
		
		//Processos
		distancia= Math.sqrt(Math.pow((xponto2-xponto1),2)+Math.pow((yponto2-yponto1),2));
		
		System.out.printf("A distancia entre os pontos é de: "+distancia+ " metros");
				
		
		
}
}		
		
		
		

