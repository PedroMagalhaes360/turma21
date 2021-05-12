package lista6_2;

public class Cavalo extends Animal {
	private boolean correr;

	 public Cavalo(String nome, int idade, boolean correr) 
	 {
		super (nome, idade);
		this. correr= correr;
	 }
	 
	@Override
	public String emitirSom() 
	{
		super.setSom("HINN IN IN");
		return super.getSom();
	}
    public  void  printHorse () 
    {
        System.out.println(" ");    
    }
}