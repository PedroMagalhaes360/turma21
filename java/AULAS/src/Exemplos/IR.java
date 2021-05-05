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
			System.out.println("Como você se identifica? (M/F/O): ");
			genero = sc.next().toUpperCase().charAt(0);
			System.out.println("Já usou o emergencial? (S/N): ");
			emergencialAux = sc.next().toUpperCase().charAt(0);
			
			if (emergencialAux == 'S') {
				emergencial = true;
			}
			
			System.out.println("Informe seu salário mensal bruto: ");
			salarioBruto = sc.nextDouble();		
			
			if ((salarioBruto * 12) > 60000.0) {
				if (salarioBruto > 5000.0 && salarioBruto < 6000.0) {
					taxa = salarioBruto * 0.15;
					if (emergencial) {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolução do auxílio emergencial.");
					}
					else {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa.");
					}
				}
				else if (salarioBruto >= 6000.0 && salarioBruto < 10000.0) {
					taxa = salarioBruto * 0.17;
					if (emergencial) {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolução do auxílio emergencial");
					}
					else {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa.");
					}
				}
				else {
					taxa = salarioBruto * 0.25;
					if (emergencial) {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa + R$" + 3000.0 + " de devolução do auxílio emergencial");
					}
					else {
						System.out.println(nome + ", você deve pagar R$" + taxa + " de taxa.");
					}
				}
				
			}
			else {
				if (genero == 'M') {
					System.out.println(nome + ", você está isento do IR e tem direito a mais um auxílio emergencial.");
				}
				else if (genero == 'F') {
					System.out.println(nome + ", você está isenta do IR e tem direito a mais um auxílio emergencial.");
				}
				else {
					System.out.println(nome + ", você está isente do IR e tem direito a mais um auxílio emergencial.");
				}
			}
			
			sc.close();
		}
	}