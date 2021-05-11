package Exemplos;

import java.util.Calendar;

import java.util.Scanner;

public class EscolaBásico {

public static void main(String[] args) {
	 
	 /*
	  * Comparar sa a data informada pelo usuario é a mesma data
	  * do aniversario, se sim for corrigir o a nota mais 10%
	  * pontos= (pontos * 0.1) + pontos. 
	  */
	 //Variaveis
	 Calendar hoje = Calendar.getInstance();
	 
	 Scanner leia = new Scanner(System.in);
	 
	 String nome;
	 int dia = hoje.get(Calendar.DAY_OF_MONTH);
	 int diaAniversario;
	 double nota= 0;
	 
	 //Entradas
	 System.out.println("Seu nome: ");
	 	nome = leia.next();
	 System.out.println("Sua nota: ");
	 	nota = leia.nextDouble();
	 System.out.println("Dia do seu Aniversário: ");
	 	diaAniversario = leia.nextInt();
	 
	 //Processos
	 if (dia == diaAniversario) 
	 {
		 System.out.println((nota *0.10)+nota);
	 }
	 else
	 	 System.out.println(nota);
	
   }
 
}
