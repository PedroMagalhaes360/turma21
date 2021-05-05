package Exemplos;

import java.util.Locale;
import java.util.Scanner;
public class IR {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			String nome;
			char genero, emergencialAux;
			double salarioBruto, taxa;
			boolean emergencial = false;
			
			System.out.print("Informe seu nome: ");
			nome = sc.nextLine();
			System.out.println("Como voc� se identifica? (M/F/O): ");
			genero = sc.next().toUpperCase().charAt(0);
			System.out.println("J� usou o emergencial? (S/N): ");
			emergencialAux = sc.next().toUpperCase().charAt(0);
			
			if (emergencialAux == 'S') {
				emergencial = true;
			}
			
			System.out.println("Informe seu sal�rio mensal bruto: ");
			salarioBruto = sc.nextDouble();		
			
			if ((salarioBruto * 12) > 60000.0) {
				if (salarioBruto > 5000.0 && salarioBruto < 6000.0) {
					taxa = salarioBruto * 0.15;
					if (emergencial) {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial.");
					}
					else {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa.");
					}
				}
				else if (salarioBruto >= 6000.0 && salarioBruto < 10000.0) {
					taxa = salarioBruto * 0.17;
					if (emergencial) {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial");
					}
					else {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa.");
					}
				}
				else {
					taxa = salarioBruto * 0.25;
					if (emergencial) {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolu��o do aux�lio emergencial");
					}
					else {
						System.out.println(nome + ", voc� deve pagar R$" + taxa + " de taxa.");
					}
				}
				
			}
			else {
				if (genero == 'M') {
					System.out.println(nome + ", voc� est� isento do IR e tem direito a mais um aux�lio emergencial.");
				}
				else if (genero == 'F') {
					System.out.println(nome + ", voc� est� isenta do IR e tem direito a mais um aux�lio emergencial.");
				}
				else {
					System.out.println(nome + ", voc� est� isente do IR e tem direito a mais um aux�lio emergencial.");
				}
			}
			
			sc.close();
		}
	}