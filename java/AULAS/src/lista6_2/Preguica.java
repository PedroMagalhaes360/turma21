package lista6_2;

public class Preguica extends Animal {
	private boolean subir;
	
	public Preguica(String nome, int idade, boolean subir) 
	{
		super (nome, idade);
	}
	
	public String emitirSom() 
	{
		super.setSom ("UUMMMMMM");
		return super.getSom();	
	}
}