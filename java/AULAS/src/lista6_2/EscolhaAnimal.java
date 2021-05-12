package lista6_2;

import lista6.Cachorro;
import lista6.Cavalo;
import lista6.Preguica;

public class EscolhaAnimal {
		
		public static void main(String[] args) {
			
		Cachorro doguin= new Cachorro("John" , 10 , true);
		Cavalo cavalin= new Cavalo("Napoleão" , 15 , false);
		Preguica preguica= new Preguica("Sid" , 8 , true);

		System.out.println("Sr. Dog !!!");
		doguin.emitirSom();
		System.out.printf("%s, ele tem %d anos, disse: %s \n" , doguin.getNome(), doguin.getIdade(), doguin.emitirSom());
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("Sr. Cavalo !!!");
		cavalin.emitirSom();
		System.out.printf("%s, ele tem %d anos, disse: %s\n" ,cavalin.getNome(), cavalin.getIdade(), cavalin.emitirSom());
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("Sr. Preguiça !!!");
		preguica.emitirSom();
		System.out.printf("%s, ele tem %d anos, disse: %s \n " ,preguica.getNome(), preguica.getIdade(), preguica.emitirSom ());
		
		
	}
}