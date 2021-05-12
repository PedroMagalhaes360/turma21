package lista6_2;

public class Animal {
	
	private String nome;
	private int idade;
	private String som;


	public Animal (String nome, int idade) 
	{
		this. idade = idade;
	}

	public String getSom() 
	{
		return som;
	}

	public void setSom(String som) 
	{
		this. som= som;
	}

	public String emitirSom() 
	{
		som= "Emitindo som" ;
		return som;
	}
}
