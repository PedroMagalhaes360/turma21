package lista3;

public class Atividade1 {
	public static void main(String[] args) {
		/*
		 * 1-Informar todos os números de 1000 a 1999 que quando
		 * divididos por 11 obtemos resto = 5. (FOR)
		 */
		//Variaveis
		int numeros;
		
		//Processos
		for (numeros= 1000; numeros<= 1999; numeros++) 
		{
			if ((numeros % 11)== 5) 
			{
				System.out.printf("\n %d" ,numeros);
			}
		}

		
	}
}
