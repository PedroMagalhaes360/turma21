package  lista6 ;

public class Cachorro extends Animal {
	 private boolean correr;
	 private String som= "AU AU AU AU AU";

	 	public Cachorro( String  nome , int  idade , boolean  correr ) 
	 	{
		 	super (nome, idade);
			this.correr = correr;
	 	}
	 	
	 	public boolean isCorrer () 
	 	{
			return correr;
		}
		
	 	public void setCorrer(boolean correr) 
		{
			this.correr = correr;
		}
		
		public String emitirSom() 
		{
			return som;
		}
	
}

	