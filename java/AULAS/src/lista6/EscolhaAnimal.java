package lista6;

public class EscolhaAnimal {
		
		public static void main(String[] args) {
			
		Cachorro doguin= new Cachorro("John" , 10 , true);
		Cavalo cavalin= new Cavalo("Catarine" , 15 , false);
		Preguica preguica= new Preguica("Pedro" , 8 , true);

		System.out.println("Olha o Doguin !!!");
		doguin.emitirSom();
		System.out.printf("%s, que tem %d anos, disse: %s \n" , doguin.getNome(), doguin.getIdade(), doguin.emitirSom());
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("Olha o Cavalin !!!");
		cavalin.emitirSom();
		System.out.printf("%s, que tem %d anos, disse: %s \n" ,cavalin.getNome(), cavalin.getIdade(), cavalin.emitirSom());
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("Olha a Preguiça !!!");
		preguica.emitirSom();
		System.out.printf("%s, que tem %d anos, disse: %s \n " ,preguica.getNome(), preguica.getIdade(), preguica.emitirSom ());
		
		
	}
}