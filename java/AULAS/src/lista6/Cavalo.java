package  lista6 ;

public class Cavalo extends Animal {
	 private boolean correr;
	 private String som= "HINN IN IN";

	 	public Cavalo(String nome, int idade, boolean correr) 
	 	{
	 		super (nome, idade);
	 		this.correr = correr;
	 	}
	
	 	public boolean isCorrer()
	 	{
	 		return correr;
	 	}

	 	public void setCorrer(boolean correr) 
	 	{
	 		this.correr = correr;
	 	}
	
	 	public  String  emitirSom () 
	 	{
	 		return som;
	 	}
   
}
