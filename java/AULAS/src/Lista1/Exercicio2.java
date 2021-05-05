package Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args []){
		/*
		 * 2.Faça um sistema que leia a idade de uma
		 * pessoa expressa em dias e mostre-a expressa
		 * em anos, meses e dias.
		 */
		//Variantes
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int dataNascimento;
		double dias;
		double meses;
		double anos;
		double idade;
		
		//Entradas
		System.out.println("Digite seu Nome: ");
		nome= leia.next();
		System.out.println("Digite sua idade: ");
		idade= leia.nextDouble();
		System.out.println("Digite seus meses: ");
		meses= leia.nextDouble();
		System.out.println("Digite seus dias: ");
		dias= leia.nextDouble();
		
		//Processos
		idade= (idade*365)+(meses*30)+dias;
		anos= (idade/365);
		meses= (idade/12);
		
		//Saidas
		System.out.println("A sua idade aproximada é " +idade+ " dias!");
		System.out.println("A sua idade aproximada é " +anos+ " anos!");
		System.out.println("A sua idade aproximada é " +meses+ " meses!");
		
	}

}
