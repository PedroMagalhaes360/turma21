package classes;

public class Estudante {
	//Atributos
	private String nome;
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;

	
	
	//Construtores
	public Estudante(int matricula, String cpf, double pontos, boolean status) 
	{
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	//Encapsulamento
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}
	
	public String getCpf(String cpf) 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public double getPontos() 
	{
		return pontos;
	}
	
	public boolean isStatus() 
	{
		return status;
	}
	
	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
		
	//Metodos
	public void adicionarNota(double pontos) 
	{
		this.pontos = this.pontos + pontos;
	}
	public void tirarNota(double pontos) 
	{
		this.pontos = this.pontos - pontos;
	}
		
}
