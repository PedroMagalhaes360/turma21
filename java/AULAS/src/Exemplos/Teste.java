package Exemplos;

import java.util.Calendar;

public class Teste {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("Hoje é dia: %02d", dia);
		
		
	}
	
}
