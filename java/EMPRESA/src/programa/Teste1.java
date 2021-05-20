package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class Teste1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);	
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("CADASTRO DE FUNCIONARIOS ");
		System.out.print("Digite a quantidade de funcionarios p ser cadastrada :");
		int qtde = leia.nextInt();
		
		for (int x=1; x<=qtde; x++) {
			System.out.println("Digite 1 - Funcionario 2- Funcionario Tercerizado: ");
			char op = leia.next().charAt(0);
			System.out.println("Digite o nome : ");
			String nome = leia.next().toUpperCase();
			System.out.println("Digite a matricula : ");
			String matricula = leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas :");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora : R$ ");
			double valorHora = leia.nextDouble();
			if (op =='2') {
				System.out.println("Qual o valor do adicional : R$ ");
				double adicional = leia.nextDouble();
				
				lista.add(new Terceiro(nome,matricula,horasTrabalhadas, valorHora,adicional));
			} 
			else {
				lista.add(new Funcionario(nome,matricula,horasTrabalhadas, valorHora));
			}
			
			
		}
		System.out.println(lista.size());
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTOS");
		
		//for each
		for(Funcionario func: lista) {
			System.out.println(func.getNome()+" seu salario é R$ "+func.salario());
		}
		
		
		
		
		
	}
	
}
