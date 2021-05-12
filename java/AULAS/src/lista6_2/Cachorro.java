package lista6_2;

public class Cachorro extends Animal {
	private boolean correr;


	 public Cachorro(String nome, int idade, boolean correr) 
	 {
		super (nome, idade);
		this. correr= correr;
	 }

	@Override
	public String emitirSom() 
	{
		super.setSom("AU AU AU AU AU");
		return super.getSom();
	}

    public  void  printDog () 
    {
    	System.out.println(" ");
    }
    
}