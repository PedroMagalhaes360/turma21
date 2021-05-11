package lista5_POO;

public class Cliente {

/*
 * 1)Crie uma classe cliente e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto cliente,
 * defina as instancias deste objeto e apresente as informações
 * deste objeto no console.
 */
	
	public String nome;
	public String dataNascimento;
	public String cpf;
	public char genero;
	
	public Cliente(String nome, String dataNascimento, String cpf, char genero) 
	{
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.genero = genero;
	}

	
	
	
	public String getdadosCompletos() 
	{
		String getdadosCompletos = "Nome do cliente? "+ nome +" Data de nascimento: "+ dataNascimento +" CPF: "+ cpf +" Genero: "+ genero;
		return getdadosCompletos ;
	}

	public Cliente() 
	{
		super();	
	}
	

 }


